import java.util.Scanner;

public class Test2_1 {
    public static int drink(int n){
        int count=0;
        while (n>2){
            count=count+n/3;
            n=n/3+n%3;
        }
        if (n==2){
            count=count+1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n=sc.nextInt();
            System.out.println(drink(n));
        }
    }
}

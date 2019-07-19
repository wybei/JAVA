import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.print(number(n)+" "+number(n*n));

        }
    }
    private static int number(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}

import java.util.Scanner;

public class Test04_1 {
    private static int buy(int n){
        for(int i=0;i<=n/6;i++){
            int bag=n-i*6;
            if(bag%8==0){
                return i+bag/8;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(buy(n));
        }
    }
}

import java.util.Scanner;

public class Main10_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(num(n));
        }
    }
    private static int num(int n){
        int first=0;
        int second=1;
        while (second<=n){
            int temp=first;
            first=second;
            second=first+temp;
        }
        return (second-n)>(n-first)?(n-first):(second-n);
    }
}

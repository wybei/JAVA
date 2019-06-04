import java.util.Scanner;

public class Test5_1 {

    private static int[] a=new int[100];
    private static int f(int n,int w){
        if (w==0){
            return 1;
        }
        if (w<0||(w>0&&n<0)){
            return 0;
        }
        return f(n-1,w-a[n])+f(n-1,w);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(f(n,40));
    }
}

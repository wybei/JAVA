import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(plan(n));
        }
    }
    private static int plan(int n){
        int[] result=new int[100000];
        result[1]=1;
        result[2]=2;
        result[3]=4;
        for (int i = 4; i <=n ; i++) {
            result[i]=(result[i-1]+(result[i-2]+result[i-3])%1000000007)%1000000007;
        }
        return result[n];
    }
}

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int[] A=new int[n];
            for (int i = 0; i <A.length ; i++) {
                A[i]=sc.nextInt();
            }
            System.out.println(plan(A,sum,n));
        }
    }
    private static long plan(int[] A,int sum,int n){
        long[][] arr=new long[n+1][sum+1];
        for (int i = 0; i <=n ; i++) {
            arr[i][0]=1;
        }
        for (int i = 1; i <=sum ; i++) {
            arr[0][sum]=0;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=sum ; j++) {
                if (A[i-1]<=j){
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-A[i-1]];
                }else{
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
       return arr[n][sum];
    }
}

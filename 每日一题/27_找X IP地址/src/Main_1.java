import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            System.out.println(findx(arr,x));
        }
    }
    private static int findx(int[] arr,int x){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main8_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (sc.hasNext()){
            String[] str=sc.nextLine().split(" ");
            int[] arr=new int[str.length-1];
            for (int i = 0; i <str.length-1 ; i++) {
                arr[i]=Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            int k=Integer.parseInt(str[str.length-1]);
            for (int i = 0; i <k ; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

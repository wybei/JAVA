
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] arr=str.split(" ");
            for (int i = arr.length-1; i >=0 ; i--) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

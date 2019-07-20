
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String k=n+"";
            String k2=n*n+"";
            if (k2.indexOf(k)==k2.length()-k.length()){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
}

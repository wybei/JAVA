import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String[] strs=sc.nextLine().split(" ");
            for (int i = strs.length-1; i >=0 ; i--) {
                System.out.print(strs[i]+" ");
            }
        }
    }
}

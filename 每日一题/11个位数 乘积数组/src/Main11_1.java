import java.util.Scanner;

public class Main11_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            int[] arr=new int[10];
            for (int i = 0; i <str.length() ; i++) {
                arr[str.charAt(i)-'0']++;
            }
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]!=0){
                    System.out.println(i+":"+arr[i]);
                }
            }
        }
    }
}

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] arr=str.split("_");
            for (int i = 1; i <arr.length ; i++) {
                arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            }
            for (String s:arr) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}

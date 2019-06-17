import java.util.Scanner;

public class Main14_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int[] arr=new int[10];
            for (int i = 0; i <10 ; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i <10 ; i++) {
                if (arr[i]!=0){
                    System.out.print(i);
                    arr[i]--;
                    break;
                }
            }
          /*  while (arr[0]!=0){
                System.out.print(0);
                arr[0]--;
                break;
            }*/
            for (int i = 0; i <10 ; i++) {
                while (arr[i]!=0){
                    System.out.print(i);
                    arr[i]--;
                }
            }
        }
    }
}

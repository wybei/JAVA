import java.util.Scanner;

public class Main14_2 {
/*    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            StringBuffer sb=new StringBuffer();
            int a=n*n-n+1;
            for (int i = 0; i <n-1 ; i++) {
                sb.append(a);
                sb.append("+");
                a+=2;
            }
            sb.append(a);
            System.out.println(sb.toString());
        }
    }*/
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while (sc.hasNext()){
        int n=sc.nextInt();
        int fist=n*n-n+1;
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(fist);
            System.out.print("+");
            fist=fist+2;
        }
        System.out.print(fist);
    }
}
}
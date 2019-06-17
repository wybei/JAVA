import java.util.Scanner;

public class Main15_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(addAB(a,b));
        }
    }
    public static int addAB(int A, int B) {
        int xor=0;
        int add=0;
        while (B!=0){
            xor=A^B;
            add=(A&B)<<1;
            A=xor;
            B=add;
        }
        return A;
    }
}

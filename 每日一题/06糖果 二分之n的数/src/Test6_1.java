import java.util.Scanner;

public class Test6_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int d=scanner.nextInt();
            int A=(a+c)/2;
            int B=(b+d)/2;
            int C=(d-b)/2;
            if ((A-B==a)&&(B-C==b)&&(A+B==c)&&(B+C==d)){
                System.out.print(A+" "+B+" "+C);
            }else {
                System.out.println("NO");
            }
        }
    }
}

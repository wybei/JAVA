import java.util.Scanner;

public class Main7_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int w=sc.nextInt();
            int h=sc.nextInt();
            int num=cake(w,h);
            System.out.println(num);
        }
    }
    private static int cake(int w,int h){
        int num=0;
        if (w%4==0||h%4==0){
            num=w*h/2;
        }else if (w==h&&w%2==0&&h%2==0){
            num=w*h/2+2;
        }else{
            num=w*h/2+1;
        }
        return num;
    }
}

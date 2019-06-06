import java.util.Scanner;

public class Main7_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int num=gbs(a,b);
            System.out.println(num);
        }
    }
    private static int gys(int a,int b){
        int max=0;
        int min=0;
        max=a>b?a:b;
        min=a>b?b:a;
        if (max%min!=0){
             return gys(min,max%min);
        }
        return min;
    }
    private static int gbs(int a,int b){
        return a*b/gys(a,b);
    }
}

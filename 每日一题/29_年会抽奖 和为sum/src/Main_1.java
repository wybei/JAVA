import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            float result=(count(n)/jiecheng(n)*100);
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
    private static float count(int n){
        if (n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    private static float jiecheng(int n){
        if (n==0){
            return 1;
        }else {
            return n*jiecheng(n-1);
        }
    }
}

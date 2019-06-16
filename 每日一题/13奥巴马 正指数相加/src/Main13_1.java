import java.util.Scanner;

public class Main13_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String ch=sc.next();
            int rows=(n+1)/2;
            for(int i=0;i<rows;i++){
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==rows-1||j==n-1){
                        System.out.print(ch);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

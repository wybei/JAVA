import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(number(n));
    }
    private static int number(int n){
        int number=0;
        for (int i = 2; i <=n ; i++) {
            number+=numberOf1(i);
        }
        return number;
    }
    private static int numberOf1(int i){
        int number=0;
        while (i!=0){
            if (i%10==2){
                number++;
            }
            i=i/10;
        }
        return number;
    }
}


/*import java.util.*;

public class Count2
{
    public int countNumberOf2s(int n)
    {
        int result = 0;
        for(int i=1;i<=n;i*=10)
        {
            result+=(n/i+7)/10*i+(n/i%10==2?n%i+1:0)  ;
        }
        return result;


    }
}*/

import java.util.Arrays;
import java.util.Scanner;

public class Main20_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] money=new int[n];
            for (int i = 0; i <money.length ; i++) {
                money[i]=sc.nextInt();
            }
            System.out.println(getValue(money,n));
        }
    }
    private static int getValue(int[] gifts,int n) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i <gifts.length ; i++) {
            if (count==0){
                temp=gifts[i];
                count=1;
            }else {
                if (temp==gifts[i]){
                    count++;
                }else {
                    count--;
                }
            }
        }
        int size=0;
        for (int i = 0; i <n ; i++) {
            if (gifts[i]==temp){
                size++;
            }
        }
        return size>n/2?temp:0;
    }
}

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            check(str.toCharArray());
        }
    }
    private static void check(char[] chars){
        int[] result=new int[8];
        for (int i = 0; i <chars.length ; i++) {
            int one=1;
            int count=0;
            int index=7;
            while (index>0){
                result[index]=((chars[i]&one)==0)?0:1;
                if (result[index]==1){
                    count++;
                }
                one<<=1;
                index--;
            }
            result[0]=(count % 2 == 1) ? 0 : 1;
            for (int j = 0; j <8 ; j++) {
                System.out.print(result[j]);
            }
            System.out.println();
        }
    }
}

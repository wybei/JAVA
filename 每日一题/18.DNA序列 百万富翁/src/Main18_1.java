import java.util.Scanner;

public class Main18_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.next();
            int n=sc.nextInt();
            int max=0;
            int maxIndex=0;
            for (int i = 0; i <=str.length()-n ; i++) {
                int count=0;
                for (int j = i; j <i+n ; j++) {
                    if (str.charAt(j)=='G'||str.charAt(j)=='C')
                        count++;
                    }
                if (count>max){
                    maxIndex=i;
                    max=count;
                }
            }
            System.out.println(str.substring(maxIndex,maxIndex+n));
        }
    }
}






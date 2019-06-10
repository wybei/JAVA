import java.util.Scanner;

public class Main9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count=0;
            while (n!=0){
                count+=n/5;
                n=n/5;
            }
            System.out.println(count);
        }
    }
}
/*    private static int jc(int n){
        if (n==1){
            return n;
        }
        return n*jc(n-1);
    }
    private static int num(int n){
        int count=0;
        String str=String.valueOf(jc(n));
        int[] arr=new int[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==0){
                count++;
            }
        }
        return count;
    }
}*/

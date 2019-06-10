import java.util.Scanner;

public class Main9_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer newStr=new StringBuffer(sc.nextLine());
            int n=sc.nextInt();
            System.out.println(huiwen(newStr,n,sc));
        }
    }
    private static StringBuffer huiwen(StringBuffer newStr, int n, Scanner sc){
        for (int i = 0; i <n ; i++) {
            int p=sc.nextInt();
            int l=sc.nextInt();
            StringBuffer sb=new StringBuffer(newStr.substring(p,p+l));
            newStr.insert(p+l,sb.reverse()).toString();
        }
        return newStr;
    }
}

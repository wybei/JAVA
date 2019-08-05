import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            char[] chars=str.toCharArray();
            boolean flag=false;
            for (int i = 0; i <str.length() ; i++) {
                String str1=String.copyValueOf(chars);
                char[] chars1=str1.toCharArray();
                chars1[i]=' ';
                String s=String.valueOf(chars1).replaceAll(" ","");
                if (ishuiwen(s)){
                    flag=true;
                }
            }
            if (flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    private static boolean ishuiwen(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}

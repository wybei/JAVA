import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            StringBuffer str=new StringBuffer(s1);
            for (int i = 0; i <s1.length() ; i++) {
                for (int j = 0; j <s2.length() ; j++) {
                    if (s1.charAt(i)==s2.charAt(j)){
                        str.deleteCharAt(i);
                    }
                }
            }
            System.out.println(str);
        }
    }
}

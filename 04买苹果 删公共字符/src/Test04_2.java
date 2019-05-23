import java.util.Scanner;

public class Test04_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            StringBuffer st=new StringBuffer(str1);
            for (int i = 0; i <st.length() ; i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (st.charAt(i)==str2.charAt(j)){
                        //st.replace(i,i+1,"");
                        st.deleteCharAt(i);
                    }
                }
            }
            System.out.println(st);
        }
    }
}

import java.util.Scanner;

public class Main21_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            char[] password=str.toCharArray();
            for (int i = 0; i <password.length ; i++) {
                if (password[i]!=' '){
                    password[i]= (char) (password[i]<='E'?password[i]+21:password[i]-5);
                }
            }
            System.out.println(new String(password));
        }
    }
}

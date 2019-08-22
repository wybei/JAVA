
import java.util.Scanner;

public class Main_2 {

    public static final String str1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static final String str2 = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String strEncrypt = in.nextLine();// 待加密字符串
            String strUnEncrypt = in.nextLine();// 待解密字符串

            char[] aucPassword = strEncrypt.toCharArray();
            char[] password = strUnEncrypt.toCharArray();

            Encrypt(aucPassword);
            unEncrypt(password);
        }
    }

    /**
     * 字符串加密
     *
     * @param aucPassword
     */
    public static void Encrypt(char aucPassword[]) {
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < aucPassword.length; j++) {
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (c == aucPassword[j])
                    sb.append(str2.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    /**
     * 字符串解密
     *
     * @param password
     */
    public static void unEncrypt(char password[]) {
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < password.length; j++) {
            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                if (c == password[j])
                    sb.append(str1.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}

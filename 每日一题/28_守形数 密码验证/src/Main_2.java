import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String password=sc.nextLine();
            if (checkLength(password)&&checkKinds(password)&&checkRepeat(password)) {
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }
    public static boolean checkLength(String password) {
        return password.length() > 8;
    }
    private static Boolean checkKinds(String password){
        int num=0;
        int low=0;
        int upp=0;
        int els=0;
        char[] array=password.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= '9' && array[i] >= '0') {
                num = 1;
            } else if (array[i] <= 'z' && array[i] >= 'a') {
                low = 1;
            } else if (array[i] <= 'Z' && array[i] >= 'A') {
                upp = 1;
            } else {
                els = 1;
            }
        }
        return num + low + upp + els >= 3;
    }
    private static Boolean checkRepeat(String password){
        for (int i = 0; i <password.length()-2 ; i++) {
            String str=password.substring(i,i+3);
            if (password.substring(i+1).contains(str)){
                return false;
            }
        }
        return true;
    }
}

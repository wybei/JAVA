import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            Set<String> set=new TreeSet<>();
            for (int i = 0; i <n ; i++) {
                String str=scanner.next();
                str=str.replace("-","");
                String result="";
                for (int j = 0; j <7 ; j++) {
                    result+=number.charAt(letter.indexOf(str.charAt(j)+""));
                }
                result=result.substring(0,3)+"-"+result.substring(3,7);
                if (!set.contains(result)){
                    set.add(result);
                }
            }
            for (String num:set) {
                System.out.println(num);
            }
            System.out.println();
        }
    }
}


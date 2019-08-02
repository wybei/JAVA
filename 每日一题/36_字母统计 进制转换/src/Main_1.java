import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            number(str);
        }
    }
    private static void number(String str){
        char[] chars=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
                ,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],0);
        }
        for (int i = 0; i <chars.length ; i++) {
            if (map.containsKey(chars[i])){
                int count=map.get(chars[i]);
                map.put(chars[i],count+1);
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+":"+map.get(arr[i]));
        }
    }
}

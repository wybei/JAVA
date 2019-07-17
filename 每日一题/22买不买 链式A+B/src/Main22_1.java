
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main22_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String store=sc.nextLine();
            String mine=sc.nextLine();
            List<Character> list=new ArrayList<>();
            for (int i = 0; i <store.length() ; i++) {
                list.add(store.charAt(i));
            }
            int count=0;
            for (int i = 0; i <mine.length() ; i++) {
                for (int j = 0; j <list.size() ; j++) {
                    if (mine.charAt(i)==list.get(j)){
                        count++;
                        list.remove(j);
                        break;
                    }
                }
            }
            if (count==mine.length()){
                System.out.println("Yes "+ (store.length()-count));
            }else {
                System.out.println("No "+(mine.length()-count));
            }
        }
    }
}

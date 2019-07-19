import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            Map<String,Integer> map=new LinkedHashMap<>();
            for (int i = 0; i <n ; i++) {
                map.put(sc.next(),0);
            }
            int t=sc.nextInt();
            int num=0;
            for (int i = 0; i <t ; i++) {
                String temp=sc.next();
                if (map.get(temp)==null){
                    num++;
                }else {
                    map.put(temp,map.get(temp)+1);
                }
            }
            for (Map.Entry entry:map.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("Invalid : "+num);
        }
    }
}

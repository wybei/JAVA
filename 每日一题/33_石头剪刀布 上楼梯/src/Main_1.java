import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_1 {
    static class Model{
        int win=0;
        int pj=0;
        int lost=0;
        Map<String,Integer> map=new HashMap<>();
        Model(){
            map.put("B", 0);
            map.put("C", 0);
            map.put("J", 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Model m1=new Model();
        Model m2=new Model();
        for (int i = 0; i <n ; i++) {
            String a = sc.next();
            String b = sc.next();
            judge(a, b, m1, m2);
        }
        System.out.println(m1.win+" "+m1.pj+" "+m1.lost);
        System.out.println(m2.win+" "+m2.pj+" "+m2.lost);
        System.out.println(getMost(m1.map)+" "+getMost(m2.map));
    }
    private static void judge(String a, String b, Model m1, Model m2){
        if (a.equals("C")){
            if (b.equals("C")){
                m1.pj++;
                m2.pj++;
            }else if (b.equals("J")){
                m1.win++;
                m2.lost++;
                m1.map.put("C",m1.map.get("C")+1);
            }else {
                m1.lost++;
                m2.win++;
                m2.map.put("B",m2.map.get("B")+1);
            }
        }else if (a.equals("J")){
            if (b.equals("J")){
                m1.pj++;
                m2.pj++;
            }else if (b.equals("B")){
                m1.win++;
                m2.lost++;
                m1.map.put("J",m1.map.get("J")+1);
            }else {
                m1.lost++;
                m2.win++;
                m2.map.put("C",m2.map.get("C")+1);
            }
        }else {
            if (b.equals("B")){
                m1.pj++;
                m2.pj++;
            }else if (b.equals("C")){
                m1.win++;
                m2.lost++;
                m1.map.put("B",m1.map.get("B")+1);
            }else {
                m1.lost++;
                m2.win++;
                m2.map.put("J",m2.map.get("J")+1);
            }
        }
    }
    private static String getMost(Map<String,Integer> map){
        if (map.get("C")>=map.get("J")){
            if (map.get("C")>map.get("B")){
                return "C";
            }else {
                return "B";
            }
        }else{
            if (map.get("J")>map.get("B")){
                return "J";
            }else {
                return "B";
            }
        }
    }
}

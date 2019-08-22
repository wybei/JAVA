import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] s=str.split("[^a-zA-Z]+");
            for (int i =s.length-1; i >=2 ; i--) {
                System.out.print(s[i]+" ");
            }
            if (s[0].length()==0){
                System.out.println(s[1]);
            }else {
                System.out.println(s[1]+" "+s[0]);
            }
        }
    }
}

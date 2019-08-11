import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] arr=str.split(";");
            int[] loc = {0,0};
            for (int i = 0; i < arr.length; i++) {
                int move = Integer.parseInt(arr[i].substring(1));
                if(arr[i].charAt(0)=='A'&&arr[i].substring(1).matches("\\d+")){
                    loc[0] -= move;
                }
                if(arr[i].charAt(0)=='D'){
                    loc[0] += move;
                }
                if(arr[i].charAt(0)=='W'){
                    loc[1] += move;
                }
                if(arr[i].charAt(0)=='S'){
                    loc[1] -= move;
                }
            }

            System.out.println(loc[0]+","+loc[1]);
        }
    }
}

import java.util.Scanner;

public class Main16_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String n=sc.nextLine();
            String stu=sc.nextLine();
            String[] score=stu.split(" ");
            int[] scoreArr=new int[score.length];
            for (int i = 0; i <score.length ; i++) {
                scoreArr[i]=Integer.parseInt(score[i]);
            }
            int k=sc.nextInt();
            int count=0;
            for (int i = 0; i <scoreArr.length ; i++) {
                if (scoreArr[i]==k){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

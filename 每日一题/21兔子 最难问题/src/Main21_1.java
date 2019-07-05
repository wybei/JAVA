import java.util.Scanner;

public class Main21_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(getTotalCount(month));
        }
    }
    private static int getTotalCount(int month){
        if (month <=2) {
            return 1;
        }
        return getTotalCount(month-1)+getTotalCount(month-2);
    }
}

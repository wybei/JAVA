import java.util.Scanner;

public class Main14_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x0=sc.nextInt();
            int count=0;
            while (x0 != 0 && count <= 300000) {
                x0 = ((x0 << 1) + 1) % 1000000007;
                count++;
            }
            int res = (count + 2) / 3;
            System.out.println(res<100000?res:-1);
        }
    }
}

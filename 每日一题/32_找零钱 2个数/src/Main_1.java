import java.util.Scanner;

public class Main_1 {
    private static final int[] c={17*29,29,1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String[] P=sc.next().split("\\.");
            String[] A=sc.next().split("\\.");
            int[] p={Integer.parseInt(P[0]),Integer.parseInt(P[1]),Integer.parseInt(P[2])};
            int[] a={Integer.parseInt(A[0]),Integer.parseInt(A[1]),Integer.parseInt(A[2])};
            int[] arrn= new int[a.length];
            int ta=a[0]*c[0]+a[1]*c[1]+a[2]*c[2];
            int tp=p[0]*c[0]+p[1]*c[1]+p[2]*c[2];
            int t=ta-tp;
            if (ta-tp<0){
                System.out.print("-");
                t=-t;
            }
            System.out.println(t/c[0]+"."+t%c[0]/c[1]+"."+t%c[0]%c[1]);
        }
    }
}

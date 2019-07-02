import java.util.Scanner;

public class Test25_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] xuefen=new int[n];
            for (int i = 0; i <n ; i++) {
                xuefen[i]=sc.nextInt();
            }
            int[] fenshu=new int[n];
            for (int i = 0; i <n ; i++) {
                fenshu[i]=sc.nextInt();
            }
            System.out.println(String.format("%.2f",JidianZ(xuefen,fenshu)));
        }
    }
    private static double jidian(int fenshu){
        double jidian=0.0;
        if (fenshu>=90&&fenshu<=100){
            jidian=4.0;
        }
        if (fenshu>=85&&fenshu<=89){
            jidian=3.7;
        }
        if (fenshu>=82&&fenshu<=84){
            jidian=3.3;
        }
        if (fenshu>=78&&fenshu<=81){
            jidian=3.0;
        }
        if (fenshu>=75&&fenshu<=77){
            jidian=2.7;
        }
        if (fenshu>=72&&fenshu<=74){
            jidian=2.3;
        }
        if (fenshu>=68&&fenshu<=71){
            jidian=2.0;
        }
        if (fenshu>=64&&fenshu<=67){
            jidian=1.5;
        }
        if (fenshu>=60&&fenshu<=63){
            jidian=1.0;
        }
        if (fenshu<60){
            jidian=0.0;
        }
        return jidian;
    }
    private static double JidianZ(int[] xufen,int[] fenshu){
        double jidianH=0;
        for (int i = 0; i <xufen.length ; i++) {
            jidianH+=xufen[i]*jidian(fenshu[i]);
        }
        int sum=0;
        for (int i = 0; i <xufen.length ; i++) {
            sum+=xufen[i];
        }
        return jidianH/sum;
    }
}

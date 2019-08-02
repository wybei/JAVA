public class Main_1 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for (int i = 1; i <=30 ; i++) {
            a+=10;
            b+=Math.pow(2,i-1);
        }
        System.out.println(a+" "+b);
    }
}

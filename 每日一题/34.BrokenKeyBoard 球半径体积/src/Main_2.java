import java.util.Scanner;

import static java.lang.Math.PI;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x0=sc.nextDouble();
        double y0=sc.nextDouble();
        double z0=sc.nextDouble();
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double z1=sc.nextDouble();
        double r=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0));
        double v=(4*PI*r*r*r)/3;
        System.out.printf("%.3f",r);
        System.out.print(" ");
        System.out.printf("%.3f",v);
    }
}

public class Main18_2 {
/*    public static void main(String[] args) {
        long rich=1;
        int day=30;
        while (day>0){
            rich*=rich;
            day--;

        }
        System.out.println(10*30+" "+rich);
    }*/
public static void main(String[]
                                args){ long sumRich=0;
    long sumStranger=0;
    for(int i=1;i<=30;i++){
        sumRich+=10;//累加10（万）
        sumStranger=sumStranger+(long)Math.pow(2,i-1);//累加2的n-1次方（分）
    }
    System.out.print(sumRich+" "+sumStranger);
}
}

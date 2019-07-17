import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for (int i = 0; i <n ; i++) {
                nums[i]=sc.nextInt();
            }
            int a1=0;
            int a2=0;
            int flag=1;
            int a3=0;
            int a4=0;
            int count=0;
            int a5=0;
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]%5==0&&nums[i]%2==0){
                    a1+=nums[i];
                }
                if (nums[i]%5==1){
                    a2+=nums[i]*flag;
                    flag=-flag;
                }
                if (nums[i]%5==2){
                    a3++;
                }
                if (nums[i]%5==3){
                    a4+=nums[i];
                    count++;
                }
                if (nums[i]%5==4){
                    if (nums[i]>a5){
                        a5=nums[i];
                    }
                }
            }
            if (a1!=0){
                System.out.print(a1+" ");
            }else {
                System.out.print("N"+" ");
            }
            if (a2!=0){
                System.out.print(a2+" ");
            }else {
                System.out.print("N"+" ");
            }
            if (a1!=0){
                System.out.print(a3+" ");
            }else {
                System.out.print("N"+" ");
            }
            if (a4!=0){
                System.out.print(String.format("%.1f",(float)a4/count)+" ");
            }else {
                System.out.print("N"+" ");
            }
            if (a5!=0){
                System.out.print(a5);
            }else {
                System.out.println("N");
            }
        }
    }
}

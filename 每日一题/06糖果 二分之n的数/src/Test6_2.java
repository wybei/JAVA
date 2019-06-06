import java.util.Arrays;
import java.util.Scanner;

public class Test6_2 {
/*    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            int[] nums = new int[str.length];
            for (int i = 0; i <str.length ; i++) {
                nums[i]=Integer.parseInt(str[i]);
            }
            int[] count=new int[100];
            for (int i = 0; i <nums.length ; i++) {
                count[nums[i]]++;
            }
        }
    }*/
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    while (scanner.hasNext()){
        String[] str=scanner.nextLine().split(" ");
        int[] nums=new int[str.length];
        for (int i = 0; i <str.length ; i++) {
            nums[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=1;
        int num=0;
        while (left<right){
            while ( left<right&&nums[left]==nums[left+1]){
                left++;
                count++;
            }
            if (count>=nums.length/2){
               num=nums[left];

            }
            left++;
            count=1;
        }
        System.out.println(num);
    }

}
}

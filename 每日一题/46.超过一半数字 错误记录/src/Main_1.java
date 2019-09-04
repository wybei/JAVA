

public class Main_1 {
    public static void main(String[] args) {
        int[] array={1,2,3,2,2,2,5,4};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array==null||array.length<=0){
            return 0;
        }
        int num=array[0];
        int count=0;
        for (int i = 1; i <array.length ; i++) {
            if (array[i]==num){
                count++;
            }else if (count>0){
                count--;
            }else {
                num=array[i];
            }
        }
        int count2=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==num){
                count2++;
            }
        }
        if (count2*2<=array.length){
            return 0;
        }else {
            return num;
        }
    }
}

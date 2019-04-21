import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] array){
        int len=array.length;
        int insertNum=0;
        for (int i = 1; i <len ; i++) {
            insertNum=array[i];
            int j=i-1;
            for(j=i-1;j>=0;j--){
                if(array[j]>insertNum){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=insertNum;
        }
    }


    public static void shell(int[] array, int gap) {
        int tmp = 0;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-gap; j >= 0; j = j-gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void main(String[] args) {
        /*int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           // array[i] = random.nextInt(10000)+1;
           array[i] = i+1;
        }*/
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,
                22,55,77};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}

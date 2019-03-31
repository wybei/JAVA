import java.util.Arrays;

public class TestMain {

    public static void bubbleSort(int[]array){
        for(int i=0;i<array.length-1;i++){
            int temp=0;
            int j=0;
            int f=1;
            for(j=0;j<array.length-1-i;j++){
                if(array[j+1]<array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    f=0;
                }
            }
            if(f==1){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={12,3,5,9,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
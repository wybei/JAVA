public class Test11 {
    public static int minNumberInRotateArray(int [] array){
        if(array==null||array.length==0){
            return 0;
        }
        int index1=0;
        int index2=array.length-1;
        int indexMid=index1;
        while(array[index1]>=array[index2]){
            if(index2-index1==1){
                indexMid=index2;
                break;
            }
            indexMid=(index1+index2)/2;
            //如果三个下标指向的数字相等，只能顺序查找。
            if(array[index1]==array[index2]&&array[indexMid]==array[index1]){
                return MinInOrder(array);
            }
            if(array[indexMid]>=array[index1]){
                index1=indexMid;
            }else if(array[indexMid]<=array[index2]){
                index2=indexMid;
            }
        }
        return array[indexMid];
    }
    public static int MinInOrder(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));
    }
}

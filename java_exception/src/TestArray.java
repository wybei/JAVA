

public class TestArray {
    public static void main(String[] args) {
        int[] numbers={3,5,2,5,5,5};
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i])
                max=numbers[i];
        }
        int count=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==max)
                count++;
        }
        System.out.println("最大值为"+max);
        System.out.println("最大值出现的次数为"+count);
    }
}

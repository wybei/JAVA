public class Test2{
	public static void main(String[] args){
		int array[]={1,4,3,4,55,77,6,9,8};
		java.util.Arrays.sort(array);
		int max= array[0];
		int min= array[array.length-1];
		int sum= 0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
			System.out.println("最大值为:"+max);
			System.out.println("最小值为:"+min);
			System.out.println("综合为:"+sum);
			System.out.println("平均值为:"+(double)sum/array.length);
	}
}
//Java数组章节练习题

public class ArrayUtils{
	
    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
		int max= data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]>max){
				max=data[i];
			}
		}
		return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
		int min =data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]<min){
				min=data[i];
			}
		}
		return min;
    }
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
		int sum=0;
		for(int i=0;i<data.length;i++){
			sum+=data[i];
		}
		return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		int[] c= new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=a.length;i<c.length;i++){
			c[i]=b[i-a.length];
		}
		return c;
    }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
		int[] c=new int[end-start];
        for(int i=0;i<end-start;i++){
		c[i]= data[i+start];	
		}
        return c;		
    }
    
    //6.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
		int[] c=new int[data.length];
		for(int i=0;i<data.length;i++){
			c[i]=data[(data.length)-i-1];
		}
		System.out.println("数组翻转后为");
		for(int i=0;i<data.length;i++){
		    System.out.print(c[i]);
            if(i<c.length-1){
				System.out.print(",");
			}	
		}
    }
	
	//7.打印数组
	public static void printArry(int[] temp){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]);
			if(i<temp.length-1){
				System.out.print(",");
			}
		}
	}
    public static void main(String[] args){
		//TODO 测试  
		int[] a=new int[]{3,1,6,8,4,5,2,7,9};
		int[] b=new int[]{10,12,11,16,14,15};
		int max= arrayMaxElement(a);
		int min= arrayMinElement(a);
		int sum= arrayElementSum(a);
		System.out.println("最大值为："+max);
		System.out.println("最小值为："+min);
		System.out.println("数组之和为："+sum);
		System.out.println("数组拼接后为："); 
		printArry(arrayJoin(a,b));
		System.out.println();
		System.out.println("数组截取后为：");
		printArry(arraySub(a,1,5));
		System.out.println();
		printReversal(a);
	}	
}

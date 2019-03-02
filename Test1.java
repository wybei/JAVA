import java.util.Scanner;
public class Test1{
	static long fact(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println("请输入一个整数:");
		Scanner input=new Scanner(System.in);
		int i= input.nextInt();
		System.out.println(i+"的阶乘是:"+fact(i));
	}	
}
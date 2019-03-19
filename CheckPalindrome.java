import java.util.Scanner;
public class CheckPalindrome{
	public static void main(String[] args){
		System.out.println("请输入要检测的字符串：");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(isPalindrome(s))
			System.out.println(s+"是回文串");
		else
			System.out.println(s+"不是回文串");
	}
	public static boolean isPalindrome(String s){
		int start=0;
		int end=s.length()-1;
		while(start<end){
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
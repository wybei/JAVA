public class Daffodil{
	public static void main(String[] args){
		System.out.print("水仙花数有：");
		for(int i=100;i<1000;i++){
			if(isDaffodil(i)){
				System.out.print(i+",");
			}
		}
	}
	public static boolean isDaffodil(int num){
		if(num<100 || num>1000){
			return false;
		}else{
			int gewei=num%10;
			int shiwei=(num/10)%10;
			int baiwei=num/100;
			int result=gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei;
			if(result==num){
				return true;
			}else{
				return false;
			}
		}
	}
}
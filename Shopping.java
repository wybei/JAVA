public class Shopping{
	public static void main(String[] args){
		double prise1=245;
		double prise2=570;
		double prise3=320;
		int num1=2;
		int num2=1;
		int num3=1;
		int discount=8;
		double total=(prise1*num1+prise2*num2+prise3*num3)*(discount)/10;
		double pay=1500;
		double change=pay-total;
		int score=(int)(total/100*3);
		System.out.println("********消费清单********");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t\t￥"+prise1+"\t"+num1+"\t￥"+prise1*num1);
		System.out.println("网球鞋\t\t￥"+prise2+"\t"+num2+"\t￥"+prise2*num2);
		System.out.println("网球拍\t\t￥"+prise3+"\t"+num3+"\t￥"+prise3*num3);
		System.out.println("");
		System.out.println("折扣：\t"+discount+"折");
		System.out.println("消费总金额\t￥"+total);
		System.out.println("实际交费\t￥"+pay);
		System.out.println("找钱\t￥"+change);
		System.out.println("本次购物所获得的积分是："+score);
	}
}
import java.util.Scanner;
public class TestPark{
	public static void main(String[] args){
		//定义客户端
		Client client=new Client();
		System.out.println("请输入您的车型： 公交车 大卡车 摩托车 小轿车");
		Scanner sc=new Scanner(System.in);
		String type=sc.next();
		Car car=CarFactory.creatCar(type);
		if(car ==null){
			System.out.println("车库不能停放这种类型的车");
		}
		else{
			client.Parking(car);
		}
	}
}


class Client{
	public void Parking(Car car){
		car.printCar();
	}
}


class CarFactory{
	public static Car creatCar(String type){
		switch(type){
			case "公交车":{
				return new Bus();
			}
			case "大卡车":{
				return new Truck();
			}
			case "摩托车":{
				return new Motorbike();
			}
			case "小轿车":{
				return new Sedan();
			}
			default:
			return null;
		}
	}
}


interface Car{
	void printCar();
}

class Bus implements Car{
	public void printCar(){
		System.out.println("公交车库 长：12.5  宽：2.5  高：4.0");
	}
}

class Truck implements Car{
	public void printCar(){
		System.out.println("大卡车库 长：18.0  宽：2.5  高：4.0");
	}
}

class Motorbike implements Car{
	public void printCar(){
		System.out.println("摩托车库 长：3.2  宽：1.6 高：1.8");
	}
}

class Sedan implements Car{
	public void printCar(){
		System.out.println("小轿车库 长：5.0  宽：2.0  高：2.2");
	}
}
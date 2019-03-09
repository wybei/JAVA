public class TestPerson{
	
	public static void main(String[] args){
		Person p= new Person("Mary",false);
		p.setPost("HR Director");
		p.setTel("18081318888");
        p.setAge(26);
        p.setAddress("DaTun road nno. 6, ChaoYang, Beijing");
		p.printPerson();
	}
}
	
//类	
class Person{
	
	//属性
	private String name;
	private boolean sex;
	private String tel;
	private String post;
	private int age;
	private String address;
	
	//构造方法
	public Person(String name,boolean sex){
		this.name=name;
		this.sex=sex;
	}
	//setter 用于设置
	public void setTel(String tel){
		this.tel=tel;
	}
	public void setPost(String post){
		this.post=post;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setAddress(String address){
		this.address=address;
	}
	//getter 用于获取
	public String getTel(){
		return this.tel;
	}
	public String getPost(){
		return this.post;
	}
	public int getAge(){
		return this.age;
	}
	public String getAddress(){
		return this.address;
	}
	//普通方法
	public void printPerson(){
		System.out.println("Name:"+this.name+ "  Post:" + this.post);
		System.out.println("sex:"+(this.sex?"female":"male")+"   age"+this.age);
		System.out.println("Tel:"+this.tel + "  Address:" + this.address);
	}
}
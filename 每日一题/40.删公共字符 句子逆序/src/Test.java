class Value{
    public int i=15;
}
public class Test {
    public static void main(String[] args) {
        Test t=new Test();
        t.f();
    }
    public void f(){
        int i=5;
        Value v=new Value();
        v.i=25;
        s(v,i);
        System.out.println(v.i);
    }
    public void s(Value v,int i){
        i=0;
        v.i=20;
        Value val=new Value();
        v=val;
        System.out.println(v.i+" "+i);
    }
}

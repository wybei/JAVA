public class Test {
/*    public static void main(String[] args) {
        MyStackImpl myStack=new MyStackImpl();
        myStack.push(8);
        myStack.push(9);
        myStack.push(5);
        System.out.println(myStack.pop());
        System.out.println(myStack.size());

    }*/
public static void main(String[] args) {
    MyQueneImpl myQuene=new MyQueneImpl();
    myQuene.add(5);
    myQuene.add(8);
    myQuene.add(7);
    System.out.println(myQuene.poll());
    System.out.println(myQuene.peek());
    System.out.println(myQuene.size());
}
}

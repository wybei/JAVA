public class TestMyQueue {
    private MyStackImpl myStack1;
    private MyStackImpl myStack2;
    public TestMyQueue(){
        myStack1=new MyStackImpl();
        myStack2=new MyStackImpl();
    }
    public void push(int x){
        myStack1.push(x);
    }


    public int pop() {
        int tmp=0;
        if(myStack2.empty()){
            while (!myStack1.empty()){
                myStack2.push(myStack1.pop());
            }
        }
        if(!myStack2.empty()){
            tmp=myStack2.pop();
        }
        return tmp;
    }

    /** Get the front element. */
    public int peek() {
        if (myStack2.empty()){
            while (!myStack1.empty()){
                myStack2.push(myStack1.pop());
            }
        }
        int data=myStack2.peek();
        return data;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(myStack1.empty()&&myStack2.empty()){
            return true;
        }
        return false;
    }
}

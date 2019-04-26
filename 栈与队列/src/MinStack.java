public class MinStack {
    private MyStackImpl myStack;
    private MyStackImpl minStack;
    public MinStack(){
        myStack=new MyStackImpl();
        minStack=new MyStackImpl();
    }
    public void push(int x) {
        minStack.push(x);
        if(minStack.empty()){
            minStack.push(x);
        }else {
            if (x<=minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if(!myStack.empty()){
            int tmp=myStack.pop();
            if(tmp==minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        if(myStack.empty()){
            return -1;
        }
        return myStack.peek();
    }

    public int getMin() {
        if (minStack.empty()){
            return -1;
        }
        return minStack.pop();
    }
}

public class TestMyStack {
    private MyQueneImpl myQuene1;
    private MyQueneImpl myQuene2;
    private int usedSize;
    public TestMyStack(){
        myQuene1=new MyQueneImpl();
        myQuene2=new MyQueneImpl();
    }
    /** Push element x onto stack. */
    public void push(int x) {
        if(myQuene1.empty()){
            myQuene1.add(x);
        }else if(myQuene2.empty()){
            myQuene2.add(x);
        }else{
            myQuene1.add(x);
        }
        this.usedSize++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()){
            throw new UnsupportedOperationException("异常");
        }
        int data=0;
        if(myQuene2.empty()){
            for(int i=0;i<this.usedSize-1;i++){
                myQuene1.add((myQuene2.poll()));
            }
            data=myQuene2.poll();

        }else {
            for(int i=0;i<this.usedSize-1;i++){
                myQuene2.add((myQuene1.poll()));
            }
            data=myQuene1.poll();
        }
        this.usedSize--;
        return data;
    }

    /** Get the top element. */
    public int top() {
        if (empty()){
            throw new UnsupportedOperationException("异常");
        }
        int data=0;
        if(myQuene2.empty()){
            for(int i=0;i<this.usedSize;i++){
                data=myQuene2.poll();
                myQuene1.add(data);
            }

        }else {
            for(int i=0;i<this.usedSize;i++){
                data=myQuene1.poll();
                myQuene2.add(data);
            }
        }
        this.usedSize--;
        return data;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.usedSize==0;
    }
}

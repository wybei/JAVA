public class MyStackImpl implements IMyStack{
    private int[] elem;
    private int top;
    private int usedSize;
    private static final int DEFAULT_SIZE=10;
    public MyStackImpl(){
        this.elem=new int[DEFAULT_SIZE];
        this.top=0;
        this.usedSize=0;
    }
    public boolean isFull(){
        return this.top==this.elem.length;
    }

    @Override
    public void push(int item) {
       if(isFull()) {
           throw new UnsupportedOperationException("栈已满");
       }
       this.elem[this.top++]=item;
    }

    @Override
    public int pop() {
        if (empty()){
            throw new UnsupportedOperationException("zhankong");
        }
        int data=this.elem[this.top-1];
        --this.top;
        return data;
    }

    @Override
    public int peek() {
        if (empty()){
            throw new UnsupportedOperationException("zhankong");
        }
        return this.elem[this.top-1];
    }

    @Override
    public boolean empty() {
        return this.top==0;
    }

    @Override
    public int size() {
        int count=0;
        while (top!=0){
            count++;
            top--;
        }
        return count;
    }
}

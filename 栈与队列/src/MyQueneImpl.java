

public class MyQueneImpl implements IMyQueue{
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    private Node front;
    private Node rear;
    private int useSize;

    public MyQueneImpl(){
        this.rear=null;
        this.front=null;
        this.useSize=0;
    }

    @Override
    public boolean empty() {
        return useSize==0;
    }

    @Override
    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        return this.front.data;
    }

    @Override
    public int poll() {
        if (empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        int data=this.front.data;
        this.front=this.front.next;
        useSize--;
        return data;
    }

    @Override
    public void add(int item) {
        Node node=new Node(item);
        if (empty()){
            this.front=node;
            this.rear=node;
        }else{
            rear.next=node;
            rear=rear.next;
        }
        useSize++;
    }

    @Override
    public int size() {
        return useSize--;
       /* int count=0;
        Node temp=front;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;*/
    }
}

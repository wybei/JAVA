
    import java.util.*;

     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Main22_2 { {
        public ListNode plusAB(ListNode a, ListNode b) {
            ListNode result=new ListNode(-1);
            ListNode cur=result;
            int add=0;
            while (a!=null||b!=null||add!=0){
                int aVal=a==null?0:a.val;
                int bVal=b==null?0:b.val;
                int sum=aVal+bVal+add;
                int newResutNode=sum%10;
                add=sum/10;
                cur.next=new ListNode(newResutNode);
                cur=cur.next;
                a=a==null?null:a.next;
                b=b==null?null:b.next;
            }
            return result.next;
        }
    }
}

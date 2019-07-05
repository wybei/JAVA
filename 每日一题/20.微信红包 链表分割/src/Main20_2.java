import java.util.*;


public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main20_2 {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead==null){
            return null;
        }
        ListNode leftNode=new ListNode(-1);
        ListNode rightNode=new ListNode(-1);
        ListNode leftHead=leftNode;
        ListNode rightHead=rightNode;
        ListNode curNode=pHead;
        while (curNode!=null){
            if (curNode.val<x){
                leftNode.next=curNode;
                leftNode=leftNode.next;
            }else {
                rightNode.next=curNode;
                rightNode=rightNode.next;
            }
            curNode=curNode.next;
        }
        leftNode.next=rightHead.next;
        rightNode.next=null;
        return leftHead.next;
    }
}
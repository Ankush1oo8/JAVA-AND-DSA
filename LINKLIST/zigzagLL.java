package LINKLIST;
import java.util.*;
public class zigzagLL {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;

    // size
    public static int size;
    public void zigzag(){
        //find mid
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node mid=slow;

        //reverse 2nd half
        node curr =mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;
        }
        node left=head;
        node right = prev;
        node nextl,nextr;
        //alt merge - zig zag merge
        while(left!=null && right !=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;

        }

    }
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        System.out.println(ll);
        
        System.out.println(ll);
    }
}

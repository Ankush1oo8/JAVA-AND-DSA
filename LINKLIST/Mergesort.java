package LINKLIST;

/**
 * Mergesort
 */
public class Mergesort {
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
    public void addfirst(int data) {

        node newNode = new node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("LinkList is empty!!!!");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static node getmid(node head){
        node slow=head;
        node fast=head;
    
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    
    }
public static  node merge(node head1, node head2 ){
        node mergell=new node(-1);
        node temp =mergell;
    
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head.next;
            temp=temp.next;
        }
        return mergell.next;
    
    }
    
    public static node mergesort(node head){
        if(head==null || head.next==null){
            return head;
        }
    
        //find mid
        node mid=getmid(head);
    
        //left and right MS
        node rh=mid.next;
        mid.next=null;
        node newLeft= mergesort(head);
        node newRight=mergesort(rh);
        //merge
        return merge(newLeft,newRight);
    
    }
    public static void main(String[] args) {
        Mergesort ll =new Mergesort();
        ll.addfirst(23);
        ll.addfirst(46);
        ll.addfirst(34);
        ll.addfirst(69);
        ll.print();
        ll.head=ll.mergesort(ll.head);
        ll.print();
}
}
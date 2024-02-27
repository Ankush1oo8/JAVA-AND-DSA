package LINKLIST;

/**
 * LINKLIST2
 */
public class LINKLIST2 {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static node head;
    public static node tail;
    public static int size;

    //add
    public void add(int data){
        node newNode =new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //print
    public static void print() {
        if (head == null) {
            System.out.println("LinkList is empty!!!!");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static boolean checkidcycle(){
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void REMcYCLE(){
        //detect cycle
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
              cycle=true;
                break;
            }
           
        }
        if(cycle==false){
            return;
        }
        
        //find meeting point
        node prev=null;
        slow=head;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle->last.next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new node(1);
        node temp=new node(33);
        head.next=temp;
        
        head.next.next=new node(3);
       
        head.next.next.next=temp;
        System.out.println(checkidcycle());
        REMcYCLE();
        System.out.println(checkidcycle());
        print();
    }
}
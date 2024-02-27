package LINKLIST;



public class linklist {
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

    // add first
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

    // ADD IN MIDDLE
    public void addmidddle(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        node newNode = new node(data);
        size++;
        node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // add last
    public void addlast(int data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty!!");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return -1;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // pre:size-2;
        node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int search(int target) {
        node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == target) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(node head, int target) {
        if (head == null) {
            return -1;
        }
        if (head.data == target) {
            return 0;
        }
        int idx = helper(head.next, target);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int target) {
        return helper(head, target);
    }

    public void reverse() {
        node prev = null;
        node curr = tail = head;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removenthFromEnd(int idx) {
        // cal size
        int sz = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (idx == sz) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz - idx;
        node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    private node middle(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find midddle 
        node mid= middle(head);

        //reverse 2nd half
        node curr=mid;
        node prev =null;
        while(curr!=null){
            node next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;
        //check if equal
        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left =left.next;
            right=right.next;
        }
        return true;

    }
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
        linklist ll = new linklist();

        ll.addfirst(6);

        ll.addfirst(5);
        ll.addfirst(4);

        ll.addfirst(3);
        ll.addfirst(2);

        ll.addfirst(1);

       

        
        ll.print();
       ll.zigzag();
       ll.print();
        
    }

}

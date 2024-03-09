package Heap;
import java.util.*;
public class Priotrity_Queue {
    public static void main(String[] args) {
       PriorityQueue<Integer> q=new PriorityQueue<>();
       q.add(13);
       q.add(2);
       q.add(-1);
       q.add(69);
       System.out.println(q); 
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove(); 
       }
    }
}

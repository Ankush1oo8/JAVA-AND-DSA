package QUEUE;

import java.util.*;
public class REVERSEQueue {
    public static void reverse(Queue<Integer>q){
        Stack<Integer> s=new Stack<>();
        if(q.isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        while(!q.isEmpty()){
            s.push(q.remove());
            
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        System.out.println(q);
    }
    
}
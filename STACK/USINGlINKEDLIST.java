package STACK;
import java.util.*;
/**
 * USINGlINKEDLIST
 */
public class USINGlINKEDLIST {
    static class node{
        int data;
        node next;
        node (int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
      static node head=null;

      //empty

      public static boolean isEmpty(){
        return head==null;
      }

      //push


      public static void push(int data){
        node newNode = new node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
      }

      //pop

      public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=head.data;
        head=head.next;
        return val;
      }

      //peek

      public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
      }

        }
        public static void main(String[] args) {
            Stack s=new Stack();
            s.push(5);
            s.push(69);
            s.push(33);
            while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
            } 
        }
    }
    

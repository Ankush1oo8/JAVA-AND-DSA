package STACK;
import java.util.*;

public class SATCKusingCF {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(11);
        s.push(22);
     while(!s.isEmpty()){
        System.out.println(  s.peek());
        s.pop();
      }

    }
    
}

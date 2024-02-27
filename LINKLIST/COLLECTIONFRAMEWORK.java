package LINKLIST;
import java.util.*;

public class COLLECTIONFRAMEWORK {
    public static void main(String[] args) {
         //create -> objects can't be used like int, float, boolean// classes are used Integer Float Character
    LinkedList<Integer> ll=new LinkedList<>();
    //adding elements
    ll.addLast(1);
    ll.addFirst(10);
    ll.add(1, 69);
    //printing elements
    System.out.println(ll);

    //remove elements
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
    }
   
}

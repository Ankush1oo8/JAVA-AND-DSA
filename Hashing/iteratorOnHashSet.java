package Hashing;
import java.util.*;
public class iteratorOnHashSet {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(12);
        set.add(24);
        set.add(36);
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

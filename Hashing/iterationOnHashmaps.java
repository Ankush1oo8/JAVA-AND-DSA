package Hashing;
import java.util.*;
public class iterationOnHashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer>h=new HashMap<>();
        h.put("India", 100);
        h.put("China", 200);
        h.put("US", 50);
        h.put("Japan", 10);
        h.put("Germany", 20);

        //iteration
        Set<String> keys=h.keySet();
        // System.out.println(keys);
        for (String k : keys) {
            System.out.println("keys: "+k+"  ,values: "+h.get(k));   
        }
        
    }
}

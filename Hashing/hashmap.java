package Hashing;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();

        //insertion
        h.put("India", 100);
        h.put("China", 150);
        h.put("Paki", 50);
        System.out.println(h);

        //get operation
        int population=h.get("India");
        System.out.println("Population of india is : "+population);

        //contains key
        System.out.println(h.containsKey("paki"));
        System.out.println(h.containsKey("Paki"));//case sensitive

        //remove
        h.remove("China");
        System.out.println(h);

        //size
        System.out.println(h.size());
        System.out.println();
        //clear
        h.clear();
        //is empty
        System.out.println(h.isEmpty());

    }
}

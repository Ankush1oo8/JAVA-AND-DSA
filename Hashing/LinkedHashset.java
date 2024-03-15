package Hashing;
import java.util.*;
public class LinkedHashset {
    public static void main(String[] args) {
        HashSet<String>Cities=new HashSet<>();
        Cities.add("Delhi");
        Cities.add("Mumbai");
        Cities.add("Noida");
        Cities.add("Nagpur");
        System.out.println(Cities);
        System.out.println();
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Nagpur");
        System.out.println(lhs);
        
    }
}

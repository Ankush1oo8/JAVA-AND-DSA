package ARRAYLIST;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(0);
        System.out.print(list);
        System.out.println();
        //ascending order
        Collections.sort(list);
        System.out.print(list);
        System.out.println();
         //descending order
         Collections.sort(list,Collections.reverseOrder());
         System.out.print(list);
    }
}

package ARRAYLIST;
import java.util.ArrayList;;
public class operation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        System.out.println(list);
        list.add(6);
        list.add(9);
        System.out.println(list);


        //Get operation
        int element = list.get(2);
        System.out.println(element);

        //delete operation
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(2, 10);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        
        //add on index
        list.add(1,9);
        System.out.println(list);


    }
}

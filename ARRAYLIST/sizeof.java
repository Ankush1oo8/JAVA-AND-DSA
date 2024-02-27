package ARRAYLIST;

import java.util.*;

public class sizeof {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(0);
        System.out.println(list.size());

        //printing
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
  
   
}

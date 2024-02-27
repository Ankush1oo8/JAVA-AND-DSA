package ARRAYLIST;

import java.util.ArrayList;

public class multilist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(0);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(44);
        list2.add(33);
        list2.add(22);
        list2.add(00);
        
        mainList.add(list2);
        mainList.add(list);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
                
            }
            System.out.println();
           
        }System.out.println();
        System.out.println(mainList);
    }
}

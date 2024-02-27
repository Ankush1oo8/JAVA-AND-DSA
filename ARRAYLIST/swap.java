package ARRAYLIST;
import java.util.*;
public class swap {
    public static void swapTwo(ArrayList<Integer>list,int i,int j){
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(0);
        System.out.print(list+" ");
        System.out.println();
        swapTwo(list, 1, 3);
        System.out.print(list+" ");
    }
}

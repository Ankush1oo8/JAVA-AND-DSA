package ARRAYLIST;
import java.util.*;
public class maxinArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(4999);
        list.add(10);
        list.add(1000);
        list.add(99);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}

package ARRAYLIST;

import java.util.ArrayList;

public class paisum1 {
    public static boolean pairsum1(ArrayList<Integer>list,int tar){
        int lp=0;
        int rp=list.size()-1;
        while(rp!=lp){
            //case 1
            if(list.get(rp)+list.get(lp)==tar){
                return true;
            }
            //case2
            if(list.get(rp)+list.get(lp)<tar){
                lp++;
            }else{
                rp--;
            }
              
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int tar=5;
        System.out.println(pairsum1(list, tar));
    }
}

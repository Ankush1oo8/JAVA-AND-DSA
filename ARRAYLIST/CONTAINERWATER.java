package ARRAYLIST;
import java.util.*;
/**
 * CONTAINERWATER
 */
public class CONTAINERWATER {
    public static int storewater(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(rp>lp){
            //calc water area
            int ht=Math.min(height.get(rp), height.get(lp));
            int widht=rp-lp;
            int currwater= ht*widht;
            maxWater=Math.max(maxWater, currwater);
            //update
            if(height.get(rp)<height.get(lp)){
                rp--;
            }else{
                lp++;
            }
            
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(storewater(list));
}
    
}
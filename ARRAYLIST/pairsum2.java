package ARRAYLIST;
import java.util.ArrayList;
public class pairsum2 {
     public static boolean pairsum1(ArrayList<Integer>list,int tar){
        int bp=-1;
        for(int k=0;k<list.size();k++){
            if(list.get(k)>list.get(k+1)){
                bp=k;
                break;
            }
        }
        int n=list.size();
        
        int lp=bp+1;
        int rp=bp;
        while(rp!=lp){
            //case 1
            if(list.get(rp)+list.get(lp)==tar){
                return true;
            }
            //case2
            if(list.get(rp)+list.get(lp)<tar){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
              
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int tar=16;
        System.out.println(pairsum1(list, tar));
    }
}



package GREEDY_ALGO;

import java.util.ArrayList;

public class ACTIVITYSelection {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maAct=0;
        ArrayList<Integer> a= new ArrayList<>();

        maAct=1;
        a.add(0);
        int lastEnd=end[0];
        for(int i=1; i<end.length;i++){
            if(start[i]>=lastEnd){
                maAct++;
                a.add(i);
                lastEnd=end[i];
            }
          
        }
        System.out.println(maAct);
        System.out.println(a);
    }
}

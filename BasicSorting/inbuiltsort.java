package BasicSorting;
import java.util.*;
public class inbuiltsort {
    public static void main(String[] args) {
        Integer num[]={5,3,4,2,1};
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
        //reverse inbuilt function
        Arrays.sort(num,Collections.reverseOrder());
        System.out.println();
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}

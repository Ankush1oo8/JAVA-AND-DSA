package Arrays;
import java.util.*;
public class linearSearch {
    public static int linearSearch(int num[],int target){
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,11,12};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int index=linearSearch(num, target);
        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println(index);
        }
    }
}

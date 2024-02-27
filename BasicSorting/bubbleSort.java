package BasicSorting;
import java.util.*;
public class bubbleSort {
    public static void bubble(int num[]){
       for( int turn=0;turn<num.length;turn++){
            for(int j=0;j<num.length-1-turn;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
       }
    }
    public static void main(String[] args) {
        int arr[]={5,4,2,3,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*largest element come to the end of 
array by swaping with adjacent element
*/
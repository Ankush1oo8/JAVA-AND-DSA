package BACKTRACKING;


public class Arrays {
    public static void changearr(int arr[], int i, int val){
        if(i==arr.length){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            return;
        }
        arr[i]=val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
public static void main(String[] args) {
    int arr[]=new int[5];;
    changearr(arr,0,1);
    System.out.println();
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}
    
}
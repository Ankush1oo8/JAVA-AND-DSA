package MERGE_SORT;

public class rotatedarray {

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(search(arr, 7, 0, arr.length-1));
        
    }


    public static int search(int arr[],int tar,int si, int ei){
        if(si>ei)return -1;
        int mid=si+(ei-si)/2;
        //case found
        if(arr[mid]==tar){
            return mid;
        }

        //mid on l1
        if(arr[si]<= arr[mid]){
            //case a:left
            if(arr[si]<=tar && tar<=arr[mid] ){
                return search(arr,tar,si,mid-1);
            }else{
                return search(arr,tar,mid-1,ei);
            }
        }
        //mid on l2
        else{
            //case c:right
            if(arr[mid]<=tar && tar <=arr[ei]){
return search(arr,tar,mid+1,ei);
            }        
            else{
                //case d:left
                return search(arr,tar,si,mid-1);
            }
        }
        
    
    }
 
}

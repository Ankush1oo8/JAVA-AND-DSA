package Arrays;

public class binarySearch {
    public static int binarysearch(int nums[],int target){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=((start+end)/2);
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14};
        int key =10;
        int check=binarysearch(nums,key);
        System.out.println(check);
    }
    
}

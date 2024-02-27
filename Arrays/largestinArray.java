package Arrays;

/**
 * largestinArray
 */
public class largestinArray {
    public static int getLargest(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={2,44,67,68,69,2,3};
        int max=getLargest(arr);
        System.out.println(max);
    }
}
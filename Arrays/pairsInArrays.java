package Arrays;

public class pairsInArrays {
    public static void pairs(int nums[]){
        int n=0;
        while(n<nums.length){
            for(int i=n+1;i<nums.length;i++){
                System.out.println("("+nums[n]+","+nums[i]+")");
            }n++;
        }
    }
    public static void main(String[] args) {
        int nums[]={2,3,4,5};
        pairs(nums);
    }
}

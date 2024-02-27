package BIT_Manipulation;

public class operationOnBit {
    public static int GetithBit(int n, int idx){
        int bitmask=1;
        if((n & bitmask)==1<<idx){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithBit(int n,int idx){
        int bitmask=1<<idx; 
        return n |bitmask;
    }
    public static int clearithBit(int n,int idx){
        int bitmask=~(1<<idx); 
        return n & bitmask;
    }
    public static int updateithBit(int n,int idx,int newbit){
        n=clearithBit(n, idx);
        int bitmask=newbit<<idx;
        return n| bitmask;
    }
    public static int cleariBit(int n,int idx){
        int bitmask=((~0)<<idx); 
        return n & bitmask;
    }
    public static int clearithBit(int n,int i,int j){
        int a=((~0)<<(j+1)); 
        int b=(1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.print(GetithBit(8,3)+"\n");
        System.out.println(setithBit(8, 1));
        System.out.println(clearithBit(10, 1));
        System.out.println(updateithBit(10, 2, 1));
        System.out.println(cleariBit(15, 2));
        System.out.println(clearithBit(10, 2, 4));
    
    }
}

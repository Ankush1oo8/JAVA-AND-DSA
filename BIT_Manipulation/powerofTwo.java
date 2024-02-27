package BIT_Manipulation;

public class powerofTwo {
    public static boolean powerOftwo(int n){
        return (n &(n-1))==0;
    
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(powerOftwo(n));
    }
}

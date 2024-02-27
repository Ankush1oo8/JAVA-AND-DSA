package RECURSION;

public class powerOfN {
    public static int power(int num,int power){
        if(power==1){
            return num;
        }
        return num*power(num,power-1);
    }
    public static void main(String[] args) {
        int expo=power(2, 10);
        System.out.println(expo);
    }
}

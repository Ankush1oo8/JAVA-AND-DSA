package RECURSION;

public class optiPower {
    public static int optiPower(int num,int power){
        if(power==1) return num;
        int var=optiPower(num, power/2);
        if(power%2==0){
            
            return var*var;
        }else{
            
            return var* var* num;
        }

    }
    public static void main(String[] args) {
        int expoEven=optiPower(2,10);
        int expoOdd=optiPower(2, 3);
        System.out.println(expoEven);
        System.out.println(expoOdd);
    }
}

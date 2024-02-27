package BIT_Manipulation;
import java.util.*;
public class oddOrEven {
    public static void oddEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }
   
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        oddEven(num);
        
    }
}

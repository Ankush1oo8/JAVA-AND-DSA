package functions;
import java.util.*;
public class factorial {
    public static int fact(int a){
        if(a==0 || a==0)return 1;
        int n=1;
        for(int i=a;i>0;i--){
            n=n*i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int fact=fact(a);
        System.out.println("The factorial of the given number is: "+fact);
    }
}

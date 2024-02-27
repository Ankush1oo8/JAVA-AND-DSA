package functions;
import java.util.*;
public class parameters {
    public static void calcSum(int a, int b) {//a and b are parameters
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first element: ");
        int a=sc.nextInt();
        System.out.println("enter second element: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of the given number is : "+sum);
        calcSum(a, b);//a and b are argument or actual parameters
    }

}

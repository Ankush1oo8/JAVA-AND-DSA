package functions;

import java.util.Scanner;

public class product {
    public static void productNum(int a,int b){
        int mul=a*b;
        System.out.println("The product of the given Numbers is : "+ mul);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a=sc.nextInt();
        System.out.println("Enter the second value: ");
        int b=sc.nextInt();
        productNum(a, b);
    }
    
}

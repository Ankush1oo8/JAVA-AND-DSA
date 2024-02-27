package functions;
//java always calls by value
public class callByValue {
    public static void swap(int a,int b){
        // swap
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        
    
        //swap-value exchange
        int a=5;
        int b=64;
        swap(a,b);
        
    }
}

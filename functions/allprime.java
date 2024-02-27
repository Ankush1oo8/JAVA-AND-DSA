package functions;

public class allprime {
    public static boolean isPrime(int n){
        boolean flag=true;
        if(n==2) return true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
         
    }
    public static void rangePrime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true) {
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String[] args) {
        int n=100;
        rangePrime(n);
    }
}

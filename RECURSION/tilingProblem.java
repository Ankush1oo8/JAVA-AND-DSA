package RECURSION;

public class tilingProblem {
    public static int tillingTotal(int n){
        if(n==0)return 1;
        if((n==1))return 1;
        return tillingTotal(n-1)+tillingTotal(n-2);//vertical tiles + horizontal tiles
    }
    public static void main(String[] args) {
        System.out.println(tillingTotal(4));
    }
}

package functions;

public class binomialCoeff {
        public static int fact(int a){
            if(a==0 || a==0)return 1;
            int n=1;
            for(int i=a;i>0;i--){
                n=n*i;
            }
            return n;
        }
        public static int binocoe(int n,int r){
            int a=fact(n);
            int b=fact(r);
            int c=fact(n-r);
            int binCoe=a/(b*c);
            return binCoe;
        }
        public static void main(String[] args) {
            int n=5;
            int r=2;
            System.out.println("Binomial Coefficient : "+binocoe(n, r));
        }
}

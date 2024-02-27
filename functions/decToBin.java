package functions;

public class decToBin {
    public static void decToBin(int binNum){
        
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastdigi=binNum%2;
            decNum=decNum+(lastdigi*(int)Math.pow(10,pow));
            pow++;
           binNum=binNum/2;
        }
        System.out.println(decNum);
    
        }
   public static void main(String[] args) {
    int binary=5;
   decToBin(binary);
   }
}

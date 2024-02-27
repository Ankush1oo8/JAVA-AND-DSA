package functions;

public class binaryToDecimal {
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastdigi=binNum%10;
            decNum=decNum+(lastdigi*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(decNum);
    
        }
   public static void main(String[] args) {
    int binary=101;
   binToDec(binary);
   }
}

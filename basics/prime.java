
public class prime {

    public static void main(String[] args) {
        
        int end=20;
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<=end;i++){
            int start=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) {
                    start++;
                }
            }
                if(start==2) {
                    sb.append(i+"   ");
                }
                else {
                continue;
                }
            
            
        }
        System.out.println(sb);
    }

}
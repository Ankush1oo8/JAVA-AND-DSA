package BasicSorting;

public class countingsort {
    public static void countSort(int num[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            large=Math.max(large,num[i]);
        }
        int count[]=new int[large+1];
        for(int i=0;i<num.length;i++){
           count[num[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
          int num[]={5,4,1,3,2};
        countSort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}

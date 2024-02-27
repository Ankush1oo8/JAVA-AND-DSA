package BasicSorting;

public class selectionSort {
    public static void selection(int num[]){
        
        for(int i=0;i<num.length;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
            int temp=num[min];
            num[min]=num[i];
            num[i]=temp;
        }
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        selection(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}

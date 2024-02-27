package Arrays;

public class creating {
    public static void main(String[] args) {
        int mark[]=new int[50];//can not chnange while run time
        int numbers[]={1,2,3,4,5};
        int moreNumbers[]={6,7,8,9};
        String fruits[]={"apple","banana","mango"};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        for (int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
    }
}

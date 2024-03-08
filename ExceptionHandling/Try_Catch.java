package ExceptionHandling;

public class Try_Catch {
    public static void main(String args[]){  
        try{  
           //code that may raise exception  
           int data=100/0;  
        }catch(ArithmeticException e){System.out.println(e);}  
        //rest code of the program   
        System.out.println("rest of the code...");  
        try{
            String s=null;  
            System.out.println(s.length());//NullPointerException
        }catch(NullPointerException e){
            System.out.println("Value in string is null");
        }
    
    }  
}

package ExceptionHandling;

public class throwskeyword {
    public static void main(String args[]){  
        try{  
         M m=new M();  
         m.method();  
        }catch(Exception e){System.out.println("exception handled");}     
      
        System.out.println("normal flow...");  
      }  
}
class M{  
    void method()throws Exception{  
     throw new Exception("device error");  
    }  
}
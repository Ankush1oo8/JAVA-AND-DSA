package Strings;
import java.lang.String;
public class String_function {
    public static void main(String[] args) {
        String a="Tony";
        String b="Toy";
        String c=new String("Tony");
        //cant use == to check equality
        //there is function in string called equalto
        if(a.equals(b)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        if(a.equals(c)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}

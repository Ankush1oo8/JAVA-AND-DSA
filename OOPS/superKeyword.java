package OOPS;

public class superKeyword {
    public static void main(String[] args) {
        Cat h=new Cat();
    }
}
class animal1{
    animal1(){
        System.out.println("animal1 constructor is called using super keyword");
    }
}
class Cat extends animal1{
    
   Cat(){
        super();
        System.out.println("horse constructor is called");
    }
}




/*
 * super keyword is used to refer immediate parent class object
 * 
 * - to access parents properties
 * - to access parents function
 * - to access parents constructor
 */
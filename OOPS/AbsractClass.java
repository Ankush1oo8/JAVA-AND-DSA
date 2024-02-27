package OOPS;

import javax.print.attribute.HashDocAttributeSet;

public class AbsractClass {
    public static void main(String[] args) {
        Horse chetan=new Horse();
        chetan.eat();
        chetan.walk();
        Chicken c=new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class animalss{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends animalss{
    void walk(){
        System.out.println("walks on four leg");
    }
}
class Chicken extends animalss{
    void walk(){
        System.out.println("walks on two legs");
    }
}













//cannot create an instance of abstract class
//can have abstract/non-abstract method
//ca have constructor
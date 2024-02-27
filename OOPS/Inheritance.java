package OOPS;
public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.swims();
        dogs elephant=new dogs();
        elephant.breathe();
        elephant.runs();
        elephant.small();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class SINGLE LEVEL INHERITANCE
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}
class mammal extends Animal{//single level inheritance
    int legs;
    void runs(){
        System.out.println("runs");
    }
}
class dogs extends mammal{//MULTILEVEL INHERITANCE
String breed;
void small(){
    System.out.println("smalls");
}
}
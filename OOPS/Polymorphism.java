package OOPS;

import java.lang.reflect.Constructor;

/**
 * Polymorphism
 */
public class Polymorphism {
    public static void main(String[] args) {
        Calc c=new Calc();
        System.out.println(c.sum(4,65));
        System.out.println(c.sum(4.5f,64.5f));
        System.out.println(c.sum(4,60,5));

        Deer harin =new Deer();
        harin.eat();

    }
   
    
}
class Calc{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
class Animals{
    void eat(){
        System.out.println("Eats animal");
    }
}
class Deer extends Animals{
    private int id;
    void eat(){
        System.out.println("eats grass");
    }
  
}
/*
 * complile time polymorphism
 * -method overloading-> multiple function with the same name but different parameter
 * 
 * Run time polymorphism
 * -method overriding ->parent and child classes both contain  the same function with a different defination
 */
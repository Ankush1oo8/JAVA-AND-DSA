package OOPS;

public class classes_objects {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("red");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        Students s1=new Students();
        s1.setName("Harsh");
        s1.setage(20);
        s1.setPercent(8.9f);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);

    }
}

// classees-> group of entities
// objects-> entities in real world 
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Students{
    String name;
    int age;
    float percentage ;
    void setName(String newName){
        name=newName;
    }
    void setage(int newAge){
        age=newAge;
    }
    void setPercent(float newPercent){
        percentage=newPercent;
    }
}
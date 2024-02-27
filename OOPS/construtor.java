package OOPS;

/**
 * construtor
 */
public class construtor {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 =new Student("Ankush");
        Student s3 =new Student(21);
        s1.password="aabsdhgj";
        System.out.println(s2.name);
        System.out.println(s3.rollno);
        Student s4 = new Student(s1);
        s2.password="vjhjgdf3t54"; 
    }
}
class Student{
    String name;
    int rollno;
    String password;
    Student (Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;

    }

    Student(){//non-paramerterized constructor
        System.out.println("contructor is called....");
    }
    Student(String name){//parameterized constructor
        this.name=name;
    }
    Student(int rollno){
        this.rollno=rollno;
    }
}
/*
 * constructor is a special method which is invoked automatically at the time of object creation
 * -they have same name as class or structure
 * -they dont have a return type(not even void)
 * -they are also called once,at tobject creation
 * -memory allocation happens when constructor is called.
 */
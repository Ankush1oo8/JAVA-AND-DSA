package OOPS;

public class Static {
public static void main(String[] args) {
    students s1=new students();
    s1.schoolName="Arohan Academy";
    students s2=new students();
    System.out.println(s2.schoolName);
}
}

class students {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

// satic keyword in java is used to share the same variable or method of a given
// class
// properties
// function
// blocks
// nested classes
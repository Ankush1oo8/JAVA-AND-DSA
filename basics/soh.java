public class soh {
   public static void main(String[] args) {
    Employee yukta=new Employee();
    yukta.setName("Soham");
    yukta.setSalary(1800000);
    System.out.println(yukta.name);
    System.out.println(yukta.salary);
   } 
}
class Employee{
    String name;
    int salary;

    void setName(String newName){
        name=newName;
    }
    void setSalary(int newSalary){
        salary=newSalary;
    }

}
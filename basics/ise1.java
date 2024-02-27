import java.lang.String;
public class ise1 {
    public static void main(String[] args) {
        Student11 S1=new Student11();
        S1.setId(1);
        S1.setName("Soham");
        S1.setMarks(33,44,55);

        Student11 S2=new Student11();
        S2.setId(2);
        S2.setName("Harsh");
        S2.setMarks(77,75,88);

        Student11 S3=new Student11();
        S3.setId(3);
        S3.setName("Ankush");
        S3.setMarks(90,92,95);

        System.out.println("Name:"+S1.name);
        System.out.println("Id:"+S1.id);
        System.out.println("Percentage:"+S1.percentage);
        
        System.out.println();
        System.out.println();
        System.out.println("Name:"+S2.name);
        System.out.println("Id:"+S2.id);
        System.out.println("Percentage:"+S2.percentage);
        
        System.out.println();
        System.out.println("Name:"+S3.name);
        System.out.println("Id:"+S3.id);
        System.out.println("Percentage:"+S3.percentage);
      
        System.out.println();


    }
}
     class Student11{
        int id;
        String name;
        float percentage;


        public void setId(int id) {
            this.id = id;
        }
        public void setName(String names){
            this.name=names;
        }
        public void setMarks(int phy,int chem,int math){
            percentage=(phy+chem+math)/3;
           }
         
        }
    

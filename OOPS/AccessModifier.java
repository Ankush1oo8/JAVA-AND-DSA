package OOPS;

public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc=new BankAccount();
        myAcc.username="Ankush";
        myAcc.seetPassword("Ankush@8010017202");
        System.out.println(myAcc.username);
       // System.out.println(myAcc.password);
    }
}
class BankAccount{
    public String username;
    private String password;


    public void seetPassword(String pwd){
        password=pwd;
    }
}
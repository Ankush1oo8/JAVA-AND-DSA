package Strings;

public class chatAt {
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String a="Ankush";
        String b="Chudiwal";
        String c=a+" "+b;
        System.out.println(c);
        System.out.println(c.charAt(0));
        print(c);
    }
}

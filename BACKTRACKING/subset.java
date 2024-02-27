package BACKTRACKING;

import Strings.chatAt;

public class subset {
    public static void findsubset(String str,String ans, int i){
        if(i==str.length()){
           if((ans.length()==0)){
            System.out.println("null");
           }else{
            System.out.println(ans);
           }
           return;

        }
        //yes choice
        findsubset(str, ans+str.charAt(i), i+1);

        //no choice
        findsubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        findsubset(str, ans, 0);
    }
}

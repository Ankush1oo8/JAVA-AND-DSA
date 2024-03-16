package Trie;
import java.util.*;
public class Creation {
    static class node{
        node child[]=new node[26];
        boolean eow=false;

        node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
        }
    }
    public static node root=new node();

    public static void insert(String word){
        node curr=root;
        for(int level=0; level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String word){
        node curr=root;
        for(int level=0; level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.child[idx]==null){
                return false;
            }
            curr=curr.child[idx];
        }
        return curr.eow==true;
    }
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
    
        System.out.println(search("thee"));
        System.out.println(search("thoe"));
    }

}

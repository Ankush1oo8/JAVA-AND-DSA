package Trie;

public class wordbreak {
    
    static class node{
        node child[]=new node[26];
        boolean eow=false;

       public node(){
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
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        
        for(int i=1;i<=key.length();i++){
           if( search(key.substring(0, i)) && wordBreak(key.substring(i))){
            return true;
           }

        }
        return false;
    }
    public static void main(String[] args) {
      String arr[]={"i","like","sam","samsung","mobile","ice"};
      for(int i=0;i<arr.length;i++){
        insert(arr[i]);
      }
        String key="ilikesamsung";
        System.out.println(wordBreak(key));
    }

}



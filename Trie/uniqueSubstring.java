package Trie;

public class uniqueSubstring {
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
    public static int countNodes(node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.child[i]!=null){
                count+=countNodes(root.child[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String words="ababa";
        for(int i=0;i<words.length();i++){
            String suffix=words.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
}
}

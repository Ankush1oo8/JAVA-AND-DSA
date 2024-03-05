package BINARYTREE4;

import java.util.ArrayList;

public class rootToPAth {
  


static class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
    }
}
public static node insert(node root, int val){
    if(root==null){
        root=new node(val);
        return root;
    }
    if(root.data>val){
        root.left=insert(root.left,val);
    }else{
        root.right=insert(root.right, val);
    }
    return root;
}
public static void printPath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"->");
    }
    System.out.println("Null");
}
    
public static void printRoot2Path(node root, ArrayList<Integer>path){
    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
        printPath(path);
    }
    printRoot2Path(root.left, path);
    printRoot2Path(root.right, path);
    path.remove(path.size()-1);

}
public static void inorder(node root){
    if(root==null){
        return;
    }
   inorder(root.left);
   System.out.print(root.data+" ");
   inorder(root.right);
}

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        
      inorder(root);
      System.out.println();
      printRoot2Path(root, new ArrayList<>());
      
    }
    




}

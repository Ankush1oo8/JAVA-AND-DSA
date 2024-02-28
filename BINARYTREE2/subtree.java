package BINARYTREE2;

public class subtree {
    static class node{
        int data;
        node left;
        node right;
        

        node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    public static boolean isSubtree(node root, node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static boolean isIdentical(node node, node subRoot){
        if(node==null || subRoot==null){
            return true;
        }else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);

        node subeRoot=new node(2);
        subeRoot.left=new node(4);
        subeRoot.right=new node(5);
        System.out.println(isSubtree(root,subeRoot));
    }
}

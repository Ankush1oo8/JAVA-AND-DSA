package BINARYTREE4;

public class mirrorTree {
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
    public static node mirorr(node root){
        if(root==null){
            return null;
        }
        node left=mirorr(root.left);
        node right=mirorr(root.right);
        root.left=right;
        root.right=left;
        return root;
    }

    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
        public static void main(String[] args) {
               int values[]={8,5,3,6,10,11,14};
            node root=null;
            for(int i=0;i<values.length;i++){
                root=insert(root, values[i]);
            }
            preorder(root);
            mirorr(root);
            System.out.println();
           preorder(root);
        }
}

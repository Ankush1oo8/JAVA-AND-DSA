package BINARYTREE5;

import javax.print.DocFlavor.STRING;

public class AVLTree {
    static class node{
        int data,height;
        node left;
        node right;
        node(int data){
            this.data=data;
            height=1;
        }
    }
    public static node root;
    public static int height(node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    public static int getBalance(node root){
        if(root==null){
            return 0;
        }
        return height(root.left)-height(root.right);
    }

        //right rotate
        public static node rightRotate(node y){
            node x=y.left;
            node T2=x.right;
    
            //perfrom rotation
           x.right=y;
           y.left=T2;
    
            //update height
            x.height=Math.max(height(x.left),height(x.right))+1;
            y.height=Math.max(height(y.left),height(y.right))+1;
    
            return x;
        }


    //left rotate
    public static node leftRotate(node x){
        node y=x.right;
        node T2=y.left;

        //perfrom rotation
        y.left=x;
        x.right=T2;

        //update height
        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;

        return y;
    }

    public static node insert(node root, int key){
        if(root==null){
            return new node(key);
        }
        if(key<root.data){
            root.left=insert(root.left, key);
        }else if(key>root.data){
            root.right=insert(root.right, key);
        }else{
            return root;//duplicate key not allowed
        }
        //update root height
        root.height=1 + Math.max(height(root.left),height(root.right));

        //get root's balance factor
        int bf=getBalance(root);

        //ll case
        if(bf>1 && key<root.left.data){
            return rightRotate(root);
        }
        //rr case
        if(bf<-1 && key>root.right.data){
            return leftRotate(root);
        }
        //lr case
        if(bf>1 && key > root.left.data){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        //rl case
        if(bf<-1 && key<root.right.data){
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
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
        root=insert(root,10);
        root=insert(root, 20);
        root=insert(root,30);
        root=insert(root, 40);
        root=insert(root,50);
        root=insert(root, 25);
        preorder(root);
       

    }
}

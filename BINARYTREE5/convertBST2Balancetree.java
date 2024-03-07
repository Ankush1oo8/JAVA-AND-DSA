package BINARYTREE5;
import java.util.*;
public class convertBST2Balancetree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
   
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        inorder(root.left,inorder);
       inorder.add(root.data);
        inorder(root.right,inorder);
    }
    public static node CreateBST(ArrayList<Integer> inorder,int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(inorder.get(mid));
        root.left=CreateBST(inorder, st, mid-1);
        root.right=CreateBST(inorder, mid+1, end);
        return root;
    }
    public static node balancTree(node root){
        //inorder seq
        ArrayList<Integer> inorder=new ArrayList<>();
        inorder(root, inorder);

        //sorted inorder -> balanced BST
        root=CreateBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        node root=new node(8);
         root.left=new node(6);
         root.left.left=new node(5);
         root.left.left.left=new node(3);
         root.right=new node(10);
         root.right.right=new node(11);
         root.right.right.right=new node(12);

         root=balancTree(root);
         preorder(root);
    }
}

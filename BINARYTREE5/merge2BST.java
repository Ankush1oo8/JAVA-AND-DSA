package BINARYTREE5;

import java.util.ArrayList;

public class merge2BST {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    public static void inorder(node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static node createBSt(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(arr.get(mid));
        root.left=createBSt(arr, st, mid-1);
        root.right=createBSt(arr, mid+1,end);
        return root;
    }
      
    public static node mergeBST(node root1, node root2){
        //step1
        ArrayList<Integer> arr1=new ArrayList<>();
        inorder(root1,arr1);
        //step2
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root2,arr2);

        //step 3
        int i=0,j=0;
        ArrayList<Integer> finalarr=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add((arr2.get(j)));
                j++;
            }
        }
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

        //sorted arraylist to BT
        return createBSt(finalarr, 0, finalarr.size()-1);

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
        node root1=new node(2);
        root1.left=new node(1);
        root1.right=new node(4);

        node root2=new node(9);
        root2.left=new node(3);
        root2.right=new node(12);

        node root=mergeBST(root1, root2);
        preorder(root);
    }
}

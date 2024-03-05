package BINARYTREE4;

public class delete {


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
}public static node delete(node root, int val){
    if(root.data<val){
        root.right=delete(root.right, val);
    }else if(root.data>val){
        root.left=delete(root.left,val);
    }else{
        //case 1 leaf node
        if(root.left==null && root.right==null){
            return null;
        }
        //case 2 single child
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        // case 3 both children
        node IS=findinOrderSucc(root.right);
        root.data=IS.data;
        root.right=delete(root.right, IS.data);
    }
    return root;
}
public static node findinOrderSucc(node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}

public static boolean serach(node root, int key){
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return serach(root.left,key);
    }else{
        return serach(root.right, key);
    }
    
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
      delete(root, 1);
      inorder(root);
    }
    
}



package BINARYTREE4;

public class searching {

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

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        
        System.out.println(serach(root,3));
    }
    
}

public class transSumTree {
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
    public static int sumTree(node root){
        if(root==null){
            return 0;  
        }
        int leftSum=sumTree(root.left);
        int rightSum=sumTree(root.right);
        int data=root.data;
        int ldata= root.left==null ? 0: root.left.data;
        int rdata= root.right==null ? 0: root.right.data;

        root.data=leftSum+rightSum+rdata+ldata;
        return data;
        
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
       sumTree(root);
       preorder(root);
       
    }
}

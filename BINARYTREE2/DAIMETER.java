package BINARYTREE2;

public class DAIMETER {
    static class Info{
        int daim;
        int ht;

        public Info(int daim, int ht){
            this.daim=daim;
            this.ht=ht;
        }
    }
    
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
    
    static class BinaryTree{
        static int idx=-1;
        
        public static node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            node newNode=new node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    
    public static Info diameter(node root){
        if(root == null) {  // Base case: if root is null, return 0 for both diameter and height
            return new Info(0, 0);
        }
            
        Info rinfo=diameter(root.right);
        Info linfo=diameter(root.left);
        
        int diam=Math.max(linfo.daim, Math.max(rinfo.daim, linfo.ht+rinfo.ht+1));
        int ht=Math.max(linfo.ht, rinfo.ht)+1;
        
        return new Info(diam,ht);
    }
    
    public static void main(String args[]) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root=tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(diameter(root).daim);
    }
}

package BINARYTREES;

public class diameterOfTree {
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
        public static int heightofTree(node root){
            if(root==null){
                return 0;
            }
            int lh=heightofTree(root.left);
            int rh=heightofTree(root.right);
            int height=Math.max(lh, rh)+1;
            return height;
        } 
        public static int daimeter(node root){
            if(root==null){
                return 0;
            }
            int ldiameter=daimeter(root.left);
            int lh=heightofTree(root.left);
            int rdiameter=daimeter(root.right);
            int rh=heightofTree(root.right);
            int selfDiamter=lh+rh+1;
            return Math.max(Math.max(rdiameter, ldiameter), selfDiamter);
        }
    }
    public static void main(String args[]) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
         node root=tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(tree.daimeter(root));
    
    }
}

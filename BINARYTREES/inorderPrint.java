package BINARYTREES;

public class inorderPrint {
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
       
        public static void preorderPrint(node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
        public static void inorderPrint(node root){
            if(root==null){
                return;
            }
            inorderPrint(root.left);
            System.out.print(root.data+" ");
            inorderPrint(root.right);
        }

  
    }

   
    public static void main(String args[]) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
         node root=tree.buildTree(nodes);
        tree.preorderPrint(root);
    System.out.println();
    tree.inorderPrint(root);
    }
}

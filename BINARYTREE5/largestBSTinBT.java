package BINARYTREE5;

public class largestBSTinBT {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }

static class info{
    boolean isBST;
    int size;
    int min;
    int max;

    public info(boolean isBST, int size, int min, int max){
        this.isBST=isBST;
        this.size=size;
        this.min=min;
        this.max=max;
    }
}
public static int maxBSt=0;
public static info largetBST(node root){
    if(root==null){
        return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    info left=largetBST(root.left);
    info right=largetBST(root.right);

    int size=left.size+right.size+1;
    int min=Math.min(root.data,Math.min(left.min,right.min));
    int max=Math.max(root.data,Math.max(left.max, right.max));

    if(root.data<=left.max || root.data>=right.min){
        return new info(false,size,min,max);

    }
    if(left.isBST && right.isBST){
        maxBSt=Math.max(maxBSt,size);
        return new info(true,size,min,max);
    }
    return new info(false, size,min,max);
}

    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(5);
        root.left.right=new node(20);

        root.right=new node(60);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);
        info info=largetBST(root);
        System.out.println("Largest BSt size: "+maxBSt);
    }
}

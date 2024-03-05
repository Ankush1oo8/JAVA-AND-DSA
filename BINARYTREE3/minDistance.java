import java.util.*;

public class minDistance {
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
        public static node lca2(node root, int n1,int n2){
            if(root==null){
              return null;
            }
            if(root.data==n1 || root.data==n2){
              return root;
            }
            node left=lca2(root.left, n1, n2);
            node right=lca2(root.right, n1, n2);
    
            if(right==null){
              return left;
            }
            if(left==null){
              return right;
            }
            return root;
          } 
          public static int lcadist(node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=lcadist(root.left, n);
            int rightDist=lcadist(root.right, n);

            if(leftDist==-1 && rightDist==-1){
                return -1;
            }
            else if(leftDist==-1){
                return rightDist+1;
            }
            else{
                return leftDist+1;
            }
          }
        public static int minDis(node root, int n1, int n2){
            node lca=lca2(root, n1, n2);
            int dist1=lcadist(lca,n1);
            int dist2=lcadist(lca,n2);
            return dist1+dist2;
        }

  
        public static void main(String args[]) {
            node root=new node(1);
            root.left=new node(2);
            root.right=new node(3);
            root.left.left=new node(4);
            root.left.right=new node(5);
            root.right.left=new node(6);
            root.right.right=new node(7);
            
           int n1=4, n2=6;
           System.out.println(minDis(root, n1, n2));
        }
    }
    


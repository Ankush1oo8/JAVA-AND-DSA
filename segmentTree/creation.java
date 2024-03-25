package segmentTree;

public class creation {
    static int Tree[];

    public static void init(int n){
        Tree=new int[4*n];
    }

    public static int buildST(int arr[], int i, int s, int e){
        if(s==e){
            Tree[i]=arr[s];
            return arr[s];
        }

        int mid=(s+e)/2;
        buildST(arr,2*i+1,s,mid);
        buildST(arr,2*i+2,mid+1,e);
        Tree[i]=Tree[2*i+1]+Tree[2*i+2];
        return arr[s];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        for(int i=0;i<Tree.length;i++){
            System.out.print(Tree[i]+" ");
        }
    }
}

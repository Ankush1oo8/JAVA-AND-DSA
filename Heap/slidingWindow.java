package Heap;

import java.util.*;
public class slidingWindow {
  static class pair implements Comparable<pair>{
    int val;
    int idx;
    pair(int val, int idx){
      this.val=val;
      this.idx=idx;

    }
    @Override
    public int compareTo(pair p2){
      return p2.val-this.val;
    }
  }
  public static void main(String[] args) {
    int arr[]={1,3,-1,-3,5,3,6,7};
    int k=3;
    int res[]=new int[arr.length-k+1];

    PriorityQueue<pair>p=new PriorityQueue<>();
     for(int i=0;i<k;i++){
      p.add(new pair(arr[i],i));

     }
     res[0]=p.peek().val;
     for(int i=k;i<arr.length;i++){
      while(p.size()>0 && p.peek().idx<=(i-k)){
        p.remove();
      }
      p.add(new pair(arr[i],i));
      res[i-k+1]=p.peek().val;
     }
     for(int i=0;i<res.length;i++){
      System.out.println(res[i]);
     }
  }
  
}
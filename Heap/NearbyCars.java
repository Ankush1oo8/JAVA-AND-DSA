package Heap;
import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int disq;
        int idx;
        public Point(int x, int y, int disq,int idx){
            this.x=x;
            this.y=y;
            this.disq=disq;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2 ){
            return this.disq-p2.disq;
        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Point> p=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int disq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            p.add(new Point(pts[i][0],pts[i][1],disq,i));

        }
        for(int i=0;i<k;i++){
            System.out.println("C"+p.remove().idx);
        }
    }
}

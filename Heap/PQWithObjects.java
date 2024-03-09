package Heap;
import java.util.*;
public class PQWithObjects {
    static class student implements Comparable<student>{
        int rank;
        String name;

        public student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student>pq=new PriorityQueue<>(/*to print in reverse order put 'Comparator.reverseOrder()'here */);
        pq.add(new student("A", 4));
        pq.add(new student("B", 5));
        pq.add(new student("C", 2));
        pq.add(new student("D", 12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }

    }
}

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
        PriorityQueue<>pq=new PriorityQueue<>();

    }
}

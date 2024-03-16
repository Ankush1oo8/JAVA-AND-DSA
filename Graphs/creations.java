package Graphs;
import java.util.*;
public class creations {
    static class edge{
        int src;
        int dist;
        int wt;
        public edge(int s, int d, int w){
            this.src=s;
            this.dist=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();

        }

        //o vertiex
        graph[0].add(new edge(0, 1, 5));

        //1 vertiex
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));

        //2 vertex
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 4));

        //3 vertex
        graph[3].add(new edge(3, 1, 3));
        graph[3].add(new edge(3, 2, 1));

        //4 vertex
        graph[4].add(new edge(4, 2, 2));


        //2's neighbour

        for(int i=0;i<graph[2].size();i++){
            edge e= graph[2].get(i);
            System.out.println(e.dist);
        }
    }
}

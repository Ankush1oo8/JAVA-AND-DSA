package graph2;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSorting {
    static class edge{
        int src;
        int dist;
        
        public edge(int s,int d){
            this.src=s;
            this.dist=d;
            
    }
}
    static void createGraph(ArrayList<edge> garph[]) {
        for(int i=0;i<garph.length;i++){
            garph[i]=new ArrayList<>();
        }

        garph[2].add(new edge(2, 3));

        garph[3].add(new edge(3, 1));

        garph[4].add(new edge(4, 0));
        garph[4].add(new edge(4, 1));

        garph[5].add(new edge(5, 0));
        garph[5].add(new edge(5, 2));
    
    }
    public static void topSort(ArrayList<edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer>s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
            
        }
    }
    public static void topSortUtil(ArrayList<edge>graph[],int curr,boolean vis[],Stack<Integer>s){
       vis[curr]=true;
       
       for(int i=0;i<graph[curr].size();i++){
        edge e=graph[curr].get(i);
        if(!vis[e.dist]){
            topSortUtil(graph, e.dist, vis, s);
        }
       }
       s.push(curr);
    }
     public static void main(String[] args) {
        int v=6;
        ArrayList<edge>graph[]=new ArrayList[v];
        createGraph(graph);
        topSort(graph);
     }
}

package graph2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bipartiteGraph {
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
        garph[0].add(new edge(0, 1));
        garph[0].add(new edge(0, 2));
       

        garph[1].add(new edge(1, 0));
        garph[1].add(new edge(1, 3));

        garph[2].add(new edge(2, 0));
        garph[2].add(new edge(2, 4));

        garph[3].add(new edge(3, 1));
       // garph[3].add(new edge(3, 4));
        
        garph[4].add(new edge(4, 2));
        //garph[4].add(new edge(4, 3));
        
    }
    public static boolean isBipartite(ArrayList<edge>graph []){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        edge e=(graph[curr].get(j));
                       if(col[e.dist]==-1){
                        int nextCol=col[curr]==0 ?1:0;
                        col[e.dist]=nextCol;
                        q.add(e.dist);
                       }else if(col[e.dist]==col[curr]){
                        return false;

                       }
                    }
                }
            }
        }


        return true;

    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>graph []=new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}

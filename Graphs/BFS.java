package Graphs;
import java.util.*;
public class BFS {
    static class edge{
        int src;
        int dist;
        int wt;
        public edge(int s,int d,int w){
            this.src=s;
            this.dist=d;
            this.wt=w;
    }
}
    static void createGraph(ArrayList<edge> garph[]) {
        for(int i=0;i<garph.length;i++){
            garph[i]=new ArrayList<>();
        }
        garph[0].add(new edge(0, 1, 1));
        garph[0].add(new edge(0, 2, 1));

        garph[1].add(new edge(1, 0, 1));
        garph[1].add(new edge(1, 3, 1));

        garph[2].add(new edge(2, 0, 1));
        garph[2].add(new edge(2, 4 , 1));

        garph[3].add(new edge(3, 1, 1));
        garph[3].add(new edge(3, 4, 1));
        garph[3].add(new edge(3, 5, 1));

        garph[4].add(new edge(4, 2, 1));
        garph[4].add(new edge(4, 3, 1));
        garph[4].add(new edge(4, 5, 1));

        garph[5].add(new edge(5, 3, 1));
        garph[5].add(new edge(5, 4, 1));
        garph[5].add(new edge(5, 6, 1));

        garph[5].add(new edge(6, 5, 1));
        
    }
    public static void bfs(ArrayList<edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);//source
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }

public static void main(String[] args) {
    int v=7;
    ArrayList<edge>graph[]=new ArrayList[v];
    createGraph(graph);
    bfs(graph);

}
}

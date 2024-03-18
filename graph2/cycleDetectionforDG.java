package graph2;
import java.util.*;
public class cycleDetectionforDG {
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
        garph[0].add(new edge(0, 2));
        
       

        garph[1].add(new edge(1, 0));
        

        garph[2].add(new edge(2, 3));
        

        garph[3].add(new edge(3, 0));
    
    }

    public static boolean isCycle(ArrayList<edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                isCycleUtil(graph,i,vis,stack);
                return true;
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<edge>graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(stack[e.dist]){
                return true;
            }
            if(!vis[e.dist] && isCycleUtil(graph, e.dist, vis, stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}

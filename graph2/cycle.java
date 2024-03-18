package graph2;

import java.util.ArrayList;

public class cycle {
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
        garph[0].add(new edge(0, 3));

        garph[1].add(new edge(1, 0));
        garph[1].add(new edge(1, 2));

        garph[2].add(new edge(2, 0));
        garph[2].add(new edge(2, 1));

        garph[3].add(new edge(3, 1));
        garph[3].add(new edge(3, 4));
        

        garph[4].add(new edge(4, 3));
        
    }

    public static boolean detectCycle(ArrayList<edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectcycleUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
   public static boolean detectcycleUtil(ArrayList<edge>[] graph,boolean vis[],int curr,int par){
    vis[curr]=true;

    for(int i=0;i<graph[curr].size();i++){
        edge e=graph[curr].get(i);
        if(!vis[e.dist] && detectcycleUtil(graph,vis,e.dist,curr)){
            return true;
        }else if(vis[e.dist] && e.dist!=par){
          return true;  
        }
    }
    return false;
   }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge>graph[]=new ArrayList[v];
        createGraph(graph);  
        System.out.println(detectCycle(graph));
    } 
}

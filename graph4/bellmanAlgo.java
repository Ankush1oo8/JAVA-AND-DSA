package graph4;

import java.util.*;

public class bellmanAlgo {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }

    static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 2, -4));

        graph[2].add(new edge(2, 3, 2));

        graph[3].add(new edge(3, 4, 4));

        graph[4].add(new edge(4, 1, -1));
    }
    public static void bellmanFord(ArrayList<edge>graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        int V=graph.length;
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    edge e=graph[j].get(k);

                    int u=e.src;
                    int v=e.dest;
                    int w=e.wt;

                    //relaxation
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){
                        dist[v]=dist[u]+w;
                    }

                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>graph[]=new ArrayList[v];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}
package graph5;

import java.util.*;

public class connectingcities  {
    static class edge implements Comparable<edge>{
        int dest;
        int cost;

        public edge(int d, int cost){
            this.dest=d;
            this.cost=cost;
        }
        @Override
        public int compareTo(edge e2){
            return this.cost-e2.cost;
        }
    }
    public static int connectCities(int cities[][]){
        PriorityQueue<edge>p=new PriorityQueue<>();
        boolean vis[]=new boolean[cities.length];
        p.add(new edge(0, 0));
        int finalcost=0;
        while(!p.isEmpty()){
            edge curr=p.remove();
            if(!vis[curr.dest]){
                vis[curr.dest]=true;
                finalcost+=curr.cost;
                for(int i=0;i<cities[curr.dest].length;i++){
                    if(cities[curr.dest][i]!=0){
                        p.add(new edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalcost;
    }
    public static void main(String[] args) {
        int cities[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
        System.out.println(connectCities(cities));

        
        
    }
}

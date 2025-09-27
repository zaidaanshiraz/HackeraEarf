//https://nados.io/question/spread-of-infection?zen=true

import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   static class Pair{
      int vtx;
      int t;
      Pair(int vtx,int time)
      {
         this.vtx=vtx;
         this.t=time;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      int count=0;
      // write your code here
      boolean[][] mat=new boolean[vtces][vtces];

      for(int i=0;i<vtces;i++){
         ArrayList<Edge> al=graph[i];
         for(Edge e:al){
            int u=e.src;
            int v=e.nbr;

            mat[u][v]=true;
            mat[v][u]=true;
         }
      }






      boolean []visited=new  boolean[vtces];
      ArrayDeque<Pair> pq=new ArrayDeque<>();
      pq.add(new Pair(src,1));
      while(pq.size()>0)
      {
         Pair rem=pq.remove();
         if(visited[rem.vtx]==true)
         {
            continue;
         }
         visited[rem.vtx]=true;
         if(rem.t>t) 
         {
            break;
         }
         count++;
         for(int i=0;i<vtces;i++)
         {
            // Edge e=graph[rem.vtx].get(i);
            if(mat[rem.vtx][i]==false) continue;
            int nbr=i;
            if(visited[nbr]==false)
            {
               pq.add(new Pair(nbr,rem.t+1));
            }
         }

      }
      System.out.println(count);
     // System.out.println(pq);
   }

}
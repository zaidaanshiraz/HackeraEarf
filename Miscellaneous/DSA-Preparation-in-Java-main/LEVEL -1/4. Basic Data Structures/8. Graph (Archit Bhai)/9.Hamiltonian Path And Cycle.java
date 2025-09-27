///https://nados.io/question/hamiltonian-path-and-cycle?zen=true

import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
   boolean []vis=new boolean[vtces];
   DFS(src,vis,graph,1,""+src);

   }
   public static boolean isEdge(ArrayList<Edge> []adj,int src,int dest)
   {
      for(Edge e:adj[src])
      if(e.nbr==dest) return true;
      return false;
   }
public static void DFS(int src,boolean []vis,ArrayList<Edge> []adj,int visCount,String res)
{
   if(vis[src]==true) return ;
   vis[src]=true;
   if(visCount==adj.length)
   {
      System.out.print(res);
      int orig=res.charAt(0)-'0';
      if(isEdge(adj,orig,src))
        System.out.println("*");
        else
          System.out.println(".");
      vis[src]=false;
      return ;
   }
   for(Edge e:adj[src])
   {
      DFS(e.nbr,vis,adj,visCount+1,res+e.nbr);
   }
   vis[src]=false;
}

}
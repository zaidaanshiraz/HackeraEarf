//Ques->https://nados.io/question/print-all-paths?zen=true

//Code
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
      Integer [][] graph = new Integer[vtces][vtces];
      

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1][v2]=wt;
         graph[v2][v1]=wt;
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      // write all your codes here
          boolean []visited=new boolean[vtces];
      printAllPaths(graph,visited,src,dest,src+"");
      

    }
    public static void printAllPaths(Integer[][]graph,boolean []visited ,int src,int dest,String psf)
    {
       if(src==dest)
       {
         System.out.println(psf);
         return ;
       }
       visited[src]=true;
       for(int nbr=0;nbr<graph[src].length;nbr++)
       {
          if(graph[src][nbr]!=null&&visited[nbr]==false)
          {
            printAllPaths(graph,visited,nbr,dest,psf+nbr+"");
          }
       }
        visited[src]=false;


    }
   


}
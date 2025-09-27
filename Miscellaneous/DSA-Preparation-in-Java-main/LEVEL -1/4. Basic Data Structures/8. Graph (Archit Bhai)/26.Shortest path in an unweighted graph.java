//https://www.codingninjas.com/codestudio/problems/shortest-path-in-an-unweighted-graph_981297?leftPanelTab=0

import java.util.*;
public class Solution {
public static class Pair{
    int node;
    int parent;
    Pair(int node,int parent)
    {
        this.node=node;
        this.parent=parent;
    }
}
	public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int source, int dest) {
		// Write your code here.
//          boolean[] vis = new boolean[n+1];
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] e: edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(source,-1));
        boolean []vis=new boolean[n+1];
        int[]parent=new int[n+1];
        Arrays.fill(parent,-1);
        while(q.size()>0)
        {
            Pair front=q.remove();
            if(vis[front.node]!=false)
                continue;
            vis[front.node]=true;
            parent[front.node]=front.parent;
            for(Integer nbr:adj[front.node])
                q.add(new Pair(nbr,front.node));
        }
        LinkedList<Integer> path=new LinkedList<>();
        while(dest!=source)
        {
            path.addFirst(dest);
            dest=parent[dest];
        }
        path.addFirst(source);
        return path;
	}

}
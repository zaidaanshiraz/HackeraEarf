//https://leetcode.com/problems/find-if-path-exists-in-graph/

class Solution {
    public boolean BFS(ArrayList<Integer> adj[],  int src, int dest){
     Queue<Integer>q=new ArrayDeque<>();
boolean []vis=new boolean[adj.length];
        q.add(src);
        while(q.size()>0)
        {
            int front=q.remove();
            if(vis[front]==true)continue;
            if(front==dest)return true;
            vis[front]=true;
            for(Integer nbr:adj[front])
            {
                if(vis[nbr]==false)
                    q.add(nbr);
            }
        }
        return false;
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        ArrayList<Integer>[] adj = new ArrayList[n];
        for(int i=0; i<n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] e: edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        return BFS(adj, source, destination);
    }
}
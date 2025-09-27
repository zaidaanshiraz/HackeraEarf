//https://www.interviewbit.com/problems/largest-distance-between-nodes-of-a-tree/

public class Solution {
    public int globalDia=0;
    public void dfs(int src,int par,ArrayList<Integer>[]adj,int depth,int []height)
    {
        height[src]=depth;
        for(Integer nbr:adj[src])
        {
            if(par==nbr) continue;
            dfs(nbr,src,adj,depth+1,height);
        }
        
    }
    public int solve(int[] par) {
       int n=par.length;
       ArrayList<Integer>[]adj=new ArrayList[n];
       for(int i=0;i<n;i++)adj[i]=new ArrayList<>();
       int src=0;
       for(int i=0;i<n;i++)
       {
           if(par[i]==-1) src=i;
           else
           {
               adj[par[i]].add(i);
               adj[i].add(par[i]);
           }
       }
       int []height=new int[n];
       dfs(src,-1,adj,0,height);
       int deepest=0;
       for(int i=0;i<n;i++)
       {
           if(height[i]>height[deepest])
           deepest=i;
       }
       Arrays.fill(height,0);
       dfs(deepest,-1,adj,0,height);
       deepest=0;
       for(int i=0;i<n;i++)
       {
           if(height[i]>height[deepest])
           deepest=i;
       }
       return height[deepest];
}
}
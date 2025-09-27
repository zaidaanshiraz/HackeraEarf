//https://practice.geeksforgeeks.org/problems/topological-sort/1

class Solution
{
    static int[] BFS(int n, ArrayList<ArrayList<Integer>> adj){
        int[] incoming = new int[n];
        for(int src=0; src<adj.size(); src++){
            for(Integer nbr: adj.get(src)){
                incoming[nbr]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        // Multisource Breadth First Traversal
        for(int i=0; i<n; i++){
            if(incoming[i] == 0){
                q.add(i);
            }
        }
        
        
        int[] order = new int[n];
        int idx = 0;
        
        while(q.size() > 0){
            int src = q.remove();
            order[idx++] = src;
            
            for(Integer nbr: adj.get(src)){
                incoming[nbr]--;
                if(incoming[nbr] == 0){
                    q.add(nbr);
                }
            }
        }
        
        return order;
    }
    
    static int[] topo;
    static int idx;
    static void DFS(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        if(vis[src] == true) return;
        vis[src] = true;
        
        for(Integer nbr: adj.get(src)){
            DFS(nbr, adj, vis);
        }
        
        topo[idx--] = src;
    }
    
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int n, ArrayList<ArrayList<Integer>> adj) 
    {
        idx = n - 1;
        topo = new int[n];
        boolean[] vis = new boolean[n];
        
        // Multisource DFS
        for(int i=0; i<n; i++) DFS(i, adj, vis);
        
        return topo;
    }
}
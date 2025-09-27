//https://practice.geeksforgeeks.org/problems/topological-sort/1
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
            int[] incoming = new int[V];
        for(int src=0; src<adj.size(); src++){
            for(Integer nbr: adj.get(src)){
                incoming[nbr]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        // Multisource Breadth First Traversal
        for(int i=0; i<V; i++){
            if(incoming[i] == 0){
                q.add(i);
            }
        }
        
        
        int count=0;
        
        while(q.size() > 0){
            int src = q.remove();
            count++;
            
            for(Integer nbr: adj.get(src)){
                incoming[nbr]--;
                if(incoming[nbr] == 0){
                    q.add(nbr);
                }
            }
        }
        
        if(count==V) return false;
        return true;
    }
}
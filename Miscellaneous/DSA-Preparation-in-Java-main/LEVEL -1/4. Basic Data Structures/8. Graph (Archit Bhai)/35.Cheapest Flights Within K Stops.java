//https://leetcode.com/problems/cheapest-flights-within-k-stops/

class Solution {
    public static class Pair implements Comparable<Pair>
    {
        int node;
        int weight;
        int stops;
        public Pair (int node ,int weight,int stops)
        {
this.node=node;
        this.weight=weight;
        this.stops=stops;
        }
        public int compareTo(Pair other)
        {
            return (this.weight-other.weight);
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Pair> []adj=new ArrayList[n];
        for(int i=0;i<n;i++)adj[i]=new ArrayList<>();
        for(int []edge:flights)
        {
            adj[edge[0]].add(new Pair(edge[1],edge[2],0));
        }
        PriorityQueue<Pair> q=new PriorityQueue<>();
        q.add(new Pair(src,0,0));
        while(q.size()>0)
        {
            Pair top=q.remove();
            if(top.node==dst&&top.stops-1<=k)
                return top.weight;
            if(top.stops-1>=k) continue;
            for(Pair nbr:adj[top.node])
            {
                q.add(new Pair(nbr.node,top.weight+nbr.weight,top.stops+1));
            }
        }
        return -1;
    }
}
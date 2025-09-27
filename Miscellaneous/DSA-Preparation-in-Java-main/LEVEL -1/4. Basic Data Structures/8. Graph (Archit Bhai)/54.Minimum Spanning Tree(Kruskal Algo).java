//https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static class Edge implements Comparable <Edge>
    {
        int a,b,wt;
        Edge(int a,int b,int wt)
        {
            this.a=a;
            this.b=b;
            this.wt=wt;
        }
        public int compareTo(Edge other)
        {
            return (this.wt-other.wt);
        }
    }
       static class DSU {
        int[] parent;
        int[] rank;

        DSU(int n) {
            parent = new int[n];
            Arrays.fill(parent, -1);
            rank = new int[n];
            Arrays.fill(rank, 1);
        }

        public void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            if (pa == pb)
                return;

            if (rank[pa] > rank[pb]) {
                parent[pb] = pa;
                rank[pa] += rank[pb];
            } else {
                parent[pa] = pb;
                rank[pb] += rank[pa];
            }
        }

        public int find(int a) {
            if (parent[a] == -1)
                return a;
            return parent[a] = find(parent[a]);
        }
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        List<Edge>edges=new ArrayList<>();
        for(int src=0;src<adj.size();src++)
        {
            for(ArrayList<Integer>edge:adj.get(src))
            {
                int nbr=edge.get(0);
                int wt=edge.get(1);
                if(src>nbr) edges.add(new Edge(src,nbr,wt));
            }
        }
        DSU sets=new DSU(V);
        Collections.sort(edges);
        int cost=0;
        for(Edge e:edges)
        {
            if(sets.find(e.a)==sets.find(e.b)) continue;
            sets.union(e.a,e.b);
            cost+=e.wt;
        }
        return cost;
    }
}


//https://leetcode.com/problems/number-of-operations-to-make-network-connected/

class Solution {
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

    public static void DFS(int src, ArrayList<Edge>[] graph,
            boolean[] vis, List<Integer> component) {
        if (vis[src] == true)
            return;

        vis[src] = true;
        component.add(src);

        for (Edge e : graph[src]) {
            DFS(e.nbr, graph, vis, component);
        }
    }
      public static int  connectedComponents(ArrayList<Edge>[] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];

        List<List<Integer>> components = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                List<Integer> component = new ArrayList<>();
                DFS(i, graph, vis, component);
                components.add(component);
            }
        }
           System.out.println(components);
return components.size()-1;
        
    }
    public int makeConnected(int n, int[][] connections) {
        int edges=connections.length;
        if(edges < n-1) return -1;
          ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        // int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < connections.length; i++) {
            // String[] parts = br.readLine().split(" ");
            int v1 = connections[i][0];
            int v2 = connections[i][1];
            int wt = 0;
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

     return connectedComponents(graph);
       
    }
}
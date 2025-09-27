//https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1

class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, 100000000); // 1e8 is taken as Infinity
        dist[source] = 0; // No Relaxations: Shortest Path from Source to Source

        // Edge List to Relax All Edges (V - 1) times
        for (int i = 1; i < V; i++) {
            for (ArrayList<Integer> edge : edges) {
                int outgoing = edge.get(0); // Source of Edge
                int incoming = edge.get(1); // Destination of Edge
                int weight = edge.get(2);

                if (dist[outgoing] == 100000000)
                    continue;
                dist[incoming] = Math.min(dist[incoming], dist[outgoing] + weight);
            }
        }

        return dist;
    }
}
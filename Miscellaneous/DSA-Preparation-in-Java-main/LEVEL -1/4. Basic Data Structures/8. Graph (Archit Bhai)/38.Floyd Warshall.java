//https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1

class Solution
{
    public void shortest_distance(int[][] mat)
    {
        int n = mat.length;
        for(int mid=0; mid<n; mid++){
            for(int src=0; src<n; src++){
                for(int dest=0; dest<n; dest++){
                    if(src == mid || dest == mid || mat[src][mid] == -1 || mat[mid][dest] == -1)
                        continue;
                        
                    if(mat[src][dest] == -1) mat[src][dest] = Integer.MAX_VALUE;
                    mat[src][dest] = Math.min(mat[src][dest], mat[src][mid] + mat[mid][dest]);        
                }
            }
        }
    }
}
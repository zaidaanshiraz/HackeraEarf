//https://leetcode.com/problems/number-of-enclaves/
class Solution {
        int[][] directions = { { +1, 0 }, { -1, 0 }, { 0, +1 }, { 0, -1 } };
    // down, up, right, left
int count=0;
        public void DFS(int r, int c, int[][] grid) {
        // Out of Matrix, Water Cell, Visited Land
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == 0 || grid[r][c] == -1)
            return;

        grid[r][c] = -1; // Visited Land
        for (int[] direction : directions) {
          DFS(r + direction[0], c + direction[1], grid);
            
        }
    }
    public void DFS2(int r, int c, int[][] grid) {
        // Out of Matrix, Water Cell, Visited Land
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == 0 || grid[r][c] == -1)
            return;
if(grid[r][c]==1)
    count++;
        grid[r][c] = -1; // Visited Land
        for (int[] direction : directions) {
          DFS2(r + direction[0], c + direction[1], grid);
            
        }
    }
    public int numEnclaves(int[][] grid) {
                int islands = 0;
                for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
               if(i==0||i==grid.length-1||j==0||j==grid[0].length-1)
                   DFS(i,j,grid);
            }
        }
//                 for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {
// System.out.print(grid[i][j]+" ");
//             }
//                     System.out.println();
//         }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // Unvisited Land
                if (grid[i][j] == 1) {
                    DFS2(i, j, grid);
                    // islands++;
                }
            }
        }
        return count;
    }
}
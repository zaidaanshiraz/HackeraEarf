//https://leetcode.com/problems/01-matrix/submissions/
class Solution {
    class Pair{
    int row, col, level;
    
    Pair(int row, int col, int level){
        this.row = row;
        this.col = col;
        this.level = level;
    }
}
    int[][] calls = {{+1, 0}, {-1, 0}, {0, +1}, {0, -1}};
    public int[][] updateMatrix(int[][] mat) {
        int [][]grid=new int[mat.length][mat[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
              if(mat[i][j]==1)
                  grid[i][j]=-1;
            }
        }
          Queue<Pair> q = new LinkedList<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 0){
                    q.add(new Pair(i, j, 0));
                }
            }
             }
 
        while(q.size() > 0){
            Pair front = q.remove();
            if(grid[front.row][front.col]!=-1&&grid[front.row][front.col]<front.level) continue;  
// Already Visited
            grid[front.row][front.col] = front.level; // Visited Mark
            
            for(int i=0; i<4; i++){
                int nr = front.row + calls[i][0];
                int nc = front.col + calls[i][1];
                
                // Out of Matrix
                if(nr < 0 || nc < 0 || nr >= grid.length || nc >= grid[0].length)
                    continue;
                
                // Empty Cell or Already Rotten
                if(mat[nr][nc] == 0)
                    continue;
               
                q.add(new Pair(nr, nc, front.level + 1));
            }
        }
        return grid;
    }
}
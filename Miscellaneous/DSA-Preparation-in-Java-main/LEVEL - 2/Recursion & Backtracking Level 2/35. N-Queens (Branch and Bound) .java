//https://leetcode.com/problems/n-queens/

class Solution {
    static List<List<String>> res;
    
    public static boolean isQueenSafe(int r, int c, boolean[] ld, boolean[] rd, boolean[] col){
        int n = col.length;
        return ((ld[r - c + n - 1] == true) || (rd[r + c] == true) || (col[c] == true)) ? false : true;
    }

    public static void nqueen(int r, boolean[][] chess, boolean[] ld, boolean[] rd, boolean[] col) {
        int n = chess.length;
        if (r == n) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String curr = "";
                for (int j = 0; j < n; j++) {
                    if (chess[i][j] == true) {
                        curr = curr + "Q";
                    } else {
                        curr = curr + ".";
                    }
                }
                ans.add(curr);
            }
            res.add(ans);
            return;
        }

        
        for(int c=0; c<n; c++){
            if(isQueenSafe(r, c, ld, rd, col)){
                chess[r][c] = ld[r - c + n - 1] = rd[r + c] = col[c] = true;
                nqueen(r + 1, chess, ld, rd, col);
                chess[r][c] = ld[r - c + n - 1] = rd[r + c] = col[c] = false;
            }
        }    
    }

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        boolean[][] chess = new boolean[n][n];
        boolean[] leftDiagnol = new boolean[2 * n - 1];
        boolean[] rightDiagnol = new boolean[2 * n - 1];
        boolean[] column = new boolean[n];
        
        nqueen(0, chess, leftDiagnol, rightDiagnol, column);
        return res;
        
    }
}
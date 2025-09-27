//https://leetcode.com/problems/n-queens/

class Solution {
static List<List<String>> res;

    public static boolean isQueenSafe(int r, int c, boolean[][] vis){
        // row (left)
        for(int j=0; j<c; j++){
            if(vis[r][j] == true)
                return false;
        }
        // col (up)
        for(int i=0; i<r; i++){
            if(vis[i][c] == true)
                return false;
        }

        // left diagnol (up)
        int i = r, j = c;
        while(i >= 0 && j >= 0){
            if(vis[i][j] == true){
                return false;
            }
            i--; j--;
        }

        // right diagnol (down)
        i = r; j = c;
        while(j < vis.length && i >= 0){
            if(vis[i][j] == true){
                return false;
            }
            i--; j++;
        }

        return true;
    }

    public static void nqueen(int r, int c, int qpsf, boolean[][] vis) {
        if (qpsf == vis.length) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < vis.length; i++) {
                String curr = "";
                for (int j = 0; j < vis.length; j++) {
                    if (vis[i][j] == true) {
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
        if(r == vis.length){
            return;
        }

        if (isQueenSafe(r, c, vis)) {
            vis[r][c] = true;

            if (c == vis.length - 1) {
                nqueen(r + 1, 0, qpsf + 1, vis);
            } else {
                nqueen(r, c + 1, qpsf + 1, vis);
            }

            vis[r][c] = false;
        }

        if (c == vis.length - 1) {
            nqueen(r + 1, 0, qpsf, vis);
        } else {
            nqueen(r, c + 1, qpsf, vis);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];

        nqueen(0, 0, 0, vis);
        return res;
        
    }

}
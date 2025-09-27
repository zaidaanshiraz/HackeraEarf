//https://leetcode.com/problems/house-robber-iii/

class Solution {
    public static class Pair{
        int yes, no;
        
        Pair(int yes, int no){
            this.yes = yes;
            this.no = no;
        }
    }
    
    public Pair dfs(TreeNode root){
        if(root == null) return new Pair(0, 0);    
        
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);
        
        int no = left.yes + right.yes;
        int yes = Math.max(no, root.val + left.no + right.no);
        return new Pair(yes, no);
    }
    
    public int rob(TreeNode root) {
        return dfs(root).yes;
    }
}
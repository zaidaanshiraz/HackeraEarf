//https://leetcode.com/problems/binary-tree-maximum-path-sum/

class Solution {
    int maxPathSum = Integer.MIN_VALUE;
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        
        int leftDownPath = helper(root.left);
        int rightDownPath = helper(root.right);
        
        int currPathSum = root.val + Math.max(0, leftDownPath) + 
                            Math.max(0, rightDownPath);
        maxPathSum = Math.max(maxPathSum, currPathSum);
        
        return Math.max(0, Math.max(leftDownPath, rightDownPath)) + root.val;
    }
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxPathSum;
    }
}
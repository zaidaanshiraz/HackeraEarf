//https://leetcode.com/problems/path-sum-iii/

class Solution {
    
    public int dfs(TreeNode root, Long tar){
        if(root == null) return 0;
        
        tar -= root.val;
        
        int count = 0;
        if(tar == 0)
            count++;
        
        return count + dfs(root.left, tar) + dfs(root.right, tar);
    }
    
    public int pathSum(TreeNode root, int targetSum) {
        Long tar=(long)targetSum;
        if(root == null) return 0;
        return dfs(root, tar) + pathSum(root.left, targetSum) + 
            pathSum(root.right, targetSum);
    }
}
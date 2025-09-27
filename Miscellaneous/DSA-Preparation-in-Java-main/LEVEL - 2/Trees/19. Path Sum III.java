//https://leetcode.com/problems/path-sum-iii/
//Approach 2
class Solution{
    HashMap<Long, Integer> freq = new HashMap<>();
    
    public int helper(TreeNode root, Long targetSum, Long prefSum){
        if(root == null) return 0;
        
        prefSum += root.val;
        int count = freq.getOrDefault(prefSum - targetSum, 0);
        freq.put(prefSum, freq.getOrDefault(prefSum, 0) + 1);
        
        count += helper(root.left, targetSum, prefSum);
        count += helper(root.right, targetSum, prefSum);
        
        freq.put(prefSum, freq.getOrDefault(prefSum, 0) - 1); // Backtrack
        
        return count;
    }
    
    public int pathSum(TreeNode root, int targetSum){
        if(root == null) return 0;
        freq.put(0l, 1);
        return helper(root, 1l*targetSum, 0l);
    }
}
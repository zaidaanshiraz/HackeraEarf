//https://leetcode.com/problems/diameter-of-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    public int diameter(TreeNode root) {
        if(root == null) return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        return Math.max(lh + rh + 1, Math.max(ld, rd));
    }
    

 public int diameterOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        // Diameter in Terms of Edges = Diamater in Terms of Nodes - 1
        return diameter(root)-1;
    }
}
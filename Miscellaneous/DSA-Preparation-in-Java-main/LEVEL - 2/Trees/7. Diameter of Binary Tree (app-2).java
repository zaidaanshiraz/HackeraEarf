//https://leetcode.com/problems/diameter-of-binary-tree/submissions/

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
    public int globalDia=0;
    public int diameter(TreeNode root)
    {
        if(root==null) return 0;
        int lh=diameter(root.left);
        int rh=diameter(root.right);
        globalDia=Math.max(globalDia,lh+rh+1);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        diameter(root);
        return globalDia-1;
    }
}
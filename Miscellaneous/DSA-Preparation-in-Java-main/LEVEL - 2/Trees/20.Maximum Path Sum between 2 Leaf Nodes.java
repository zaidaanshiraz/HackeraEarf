//https://practice.geeksforgeeks.org/problems/maximum-path-sum/1

class Solution
{
    static long globalAns = Long.MIN_VALUE;
    public long diameter(Node root){
        if(root == null) return 0l;
        if(root.left == null && root.right == null) return 1l * root.data;
        if(root.left == null) return 1l * root.data + diameter(root.right);
        if(root.right == null) return 1l * root.data + diameter(root.left);
        
        long left = diameter(root.left);
        long right = diameter(root.right);
        long diameter = left + right + 1l * root.data;
        if(diameter > globalAns) globalAns = diameter;
        return root.data * 1l + Math.max(left, right);
    }
    
    int maxPathSum(Node root)
    { 
        globalAns = Long.MIN_VALUE;
        long sum = diameter(root);
        if(root.left == null || root.right == null){
            globalAns = Math.max(globalAns, sum);
        }
        return (int)globalAns;
    } 
}
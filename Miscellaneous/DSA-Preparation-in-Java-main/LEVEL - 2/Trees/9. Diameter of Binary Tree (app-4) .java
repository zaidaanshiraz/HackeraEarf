//https://leetcode.com/problems/diameter-of-binary-tree/submissions/
 public static class Pair{
        int height;
        int diameter; // Diameter is of entire subtree
    }
    
    public Pair diameter(TreeNode root){
        if(root == null) return new Pair();
        
        Pair left = diameter(root.left);
        Pair right = diameter(root.right);
        
        Pair curr = new Pair();
        curr.height = Math.max(left.height, right.height) + 1;
        curr.diameter = left.height + right.height + 1;
        curr.diameter = Math.max(curr.diameter, Math.max(left.diameter, right.diameter));
        return curr;
    }
    
    public int diameterOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        // Diameter in Terms of Edges = Diamater in Terms of Nodes - 1
        return diameter(root).diameter - 1;
    }
}

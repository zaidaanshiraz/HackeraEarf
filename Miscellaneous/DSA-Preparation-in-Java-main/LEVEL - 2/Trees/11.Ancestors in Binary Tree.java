//https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1

class Solution
{
    // Path is from root to the node
    public static boolean Ancestors(Node root, ArrayList<Integer> path, int target){
        if(root == null) return false;
        if(target == root.data) return true;
        
        path.add(root.data);
        if(Ancestors(root.left, path, target) == true)
            return true;
        
        if(Ancestors(root.right, path, target) == true)
            return true;
            
        path.remove(path.size() - 1);
        return false;
    }
    
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        ArrayList<Integer> ancestors = new ArrayList<>();
        Ancestors(root, ancestors, target);
        Collections.reverse(ancestors);
        return ancestors;
    }
}
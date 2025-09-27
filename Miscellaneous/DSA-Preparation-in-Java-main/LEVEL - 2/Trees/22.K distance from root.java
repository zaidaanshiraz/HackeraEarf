//https://practice.geeksforgeeks.org/problems/k-distance-from-root/1

class Tree
{
    void helper(Node root, int k, ArrayList<Integer> nodes){
        if(k < 0 || root == null) return;
        if(k == 0){
            nodes.add(root.data);
            return;
        }
        
        helper(root.left, k - 1, nodes);
        helper(root.right, k - 1, nodes);
    } 
    ArrayList<Integer> Kdistance(Node root, int k)
    {
         ArrayList<Integer> nodes = new ArrayList<>();
         helper(root, k, nodes);
         return nodes;
    }
}
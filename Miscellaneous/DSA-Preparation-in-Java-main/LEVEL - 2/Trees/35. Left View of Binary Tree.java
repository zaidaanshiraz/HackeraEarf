//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

class Tree
{
    public void DFS(Node root, ArrayList<Integer> leftView, int level){
        if(root == null) return;
        
        if(level >= leftView.size())
            leftView.add(root.data);
        
        DFS(root.left, leftView, level + 1);
        DFS(root.right, leftView, level + 1);
    }
    
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> leftView = new ArrayList<>();
        DFS(root, leftView, 0);
        return leftView;
    }
}
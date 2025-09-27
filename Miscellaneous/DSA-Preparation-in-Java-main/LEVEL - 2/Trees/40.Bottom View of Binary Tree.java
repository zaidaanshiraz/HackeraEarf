//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

class Solution
{
    public static class Pair{
        int data;
        int row;
        Pair(int data, int row){
            this.data = data;
            this.row = row;
        }
    }
    // Column (Vertical Level) as Key vs Row & Its Elements in Pair
    TreeMap<Integer, Pair> vertical;
    
    void DFS(Node root, int row, int col){
        if(root == null) return;
        if(vertical.containsKey(col) == false){
            vertical.put(col, new Pair(root.data, row));
        } else if(vertical.get(col).row <= row) {
            vertical.get(col).row = row;
            vertical.get(col).data = root.data;
        }
        
        DFS(root.left, row + 1, col - 1);
        DFS(root.right, row + 1, col + 1);
    }
    
    public ArrayList <Integer> bottomView(Node root)
    {
        vertical = new TreeMap<>();
        DFS(root, 0, 0);
        ArrayList<Integer> bottomView = new ArrayList<>();
        for(Integer key: vertical.keySet()){
            bottomView.add(vertical.get(key).data);
        }
        return bottomView;
    }
}
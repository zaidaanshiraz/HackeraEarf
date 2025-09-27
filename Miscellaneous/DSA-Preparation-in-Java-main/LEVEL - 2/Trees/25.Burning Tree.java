//https://practice.geeksforgeeks.org/problems/burning-tree/1

{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    static int minTime = 0;
    public static int DFS(Node root, int target){
        if(root == null) return -1;
        
        if(root.data == target){
            height(root, null, 0);
            return 1;
        }
        
        int left = DFS(root.left, target);
        if(left >= 0){
            height(root, root.left, left);
            return 1 + left;
        }
        
        int right = DFS(root.right, target);
        if(right >= 0){
            height(root, root.right, right);
            return 1 + right;
        }
        
        return -1;
    }
    
    public static void height(Node root, Node blockage, int time){
        if(root == null || root == blockage) return;
        minTime = Math.max(minTime, time);
        height(root.left, blockage, time + 1);
        height(root.right, blockage, time + 1);
    }
    
    public static int minTime(Node root, int target) 
    {
        minTime = 0;
        DFS(root, target);
        return minTime;
    }
    
}
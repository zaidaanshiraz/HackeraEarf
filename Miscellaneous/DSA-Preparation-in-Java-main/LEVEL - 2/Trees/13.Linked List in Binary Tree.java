//https://leetcode.com/problems/linked-list-in-binary-tree/description/

class Solution {
    
    public boolean isSubPathHelper(ListNode head, TreeNode root){
        if(head == null) return true;
        // Linked List has all nodes present, return true
        
        if(root == null) return false; 
        // Linked List is still remaining, but tree is empty
        
        if(root.val == head.val){
            if(isSubPathHelper(head.next, root.left) == true) 
                return true;
            
            if(isSubPathHelper(head.next, root.right) == true)
                return true;
        }
        
        return false;
    }
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null) return true;
        if(root == null) return false; 
        
        return isSubPathHelper(head, root) || isSubPath(head, root.left) 
                                          || isSubPath(head, root.right);
    }
}
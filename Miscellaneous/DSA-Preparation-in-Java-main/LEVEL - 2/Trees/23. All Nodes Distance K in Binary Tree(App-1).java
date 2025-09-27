//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> obj;
    public  ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data){
      if(node == null) // negative base case 
         return new ArrayList<>();
      
      if(node.val == data){ // positive base case
         ArrayList<TreeNode> base = new ArrayList<>();
         base.add(node);
         return base;
      }
      
      ArrayList<TreeNode> lres = nodeToRootPath(node.left, data);
      if(lres.size() > 0){
          lres.add(node);
          return lres;
      }
      
      ArrayList<TreeNode> rres = nodeToRootPath(node.right, data);
      if(rres.size() > 0){
          rres.add(node);
          return rres;
      }
      
      return new ArrayList<>();
  }
  
  public  void printKLevelsDown(TreeNode node, int k, TreeNode blockage){
    if(node == null || k < 0 || node == blockage) 
        return;
    if(k == 0){
        obj.add(node.val);
        return;
    }
    
    printKLevelsDown(node.left, k - 1, blockage);
    printKLevelsDown(node.right, k - 1, blockage);
  }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        obj=new ArrayList<>();
           ArrayList<TreeNode> n2rpath = nodeToRootPath(root, target.val);
    
    int distance = k;
    for(int i=0; i<n2rpath.size(); i++){
        if(distance < 0) break;
        TreeNode blockage = (i == 0) ? null : n2rpath.get(i - 1);    
        printKLevelsDown(n2rpath.get(i), distance, blockage);
        distance--;
    }
        return obj;
    }
}
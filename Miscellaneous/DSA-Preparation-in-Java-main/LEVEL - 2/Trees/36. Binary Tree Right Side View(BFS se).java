//https://leetcode.com/problems/binary-tree-right-side-view/

class Solution {

    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
        if(root==null) return rightView;
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                TreeNode curr=q.remove();
                if(i==count-1) rightView.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return rightView;
    }
}

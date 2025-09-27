//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

class Tree
{
    
    ArrayList<Integer> leftView(Node root)
    {
                ArrayList<Integer> leftView = new ArrayList<>();
        if(root==null) return leftView;
        Queue<Node>q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.remove();
                if(i==0) leftView.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return leftView;
    }
}
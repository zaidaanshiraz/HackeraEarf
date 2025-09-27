//https://practice.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1

class GfG
{
        public static class Node {
        Node left;
        Node right;
        int val=0;
    }
        public static void insert(Node root, int a[]) {
        for (int i = 0; i <a.length; i++) {
            int bit = a[i];

            if (bit == 0) {
                if (root.left == null)
                    root.left = new Node();
                root = root.left;
            } else {
                if (root.right == null)
                    root.right = new Node();
                root = root.right;
            }
        }
        root.val=root.val+1;
    }
    
    public static boolean find(ArrayList<Integer> obj,Node curr)
    {
        for(int i=0;i<obj.size();i++)
        {
            int val=obj.get(i);
            if(val==0)
            {
             curr=curr.left;   
            }else
            {
                curr=curr.right;
            }
        }
        if(curr.val>1)
        return false;
        return true;
    }
    
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
      Node  root=new Node();
      Node curr=root;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
         for(int i=0;i<a.length;i++)
        {int val=0;
        ArrayList<Integer> subans=new ArrayList<>();
         insert(curr,a[i]);
            for(int j=0;j<a[0].length;j++)
            {
              subans.add(a[i][j]);
            }
            boolean unique=find(subans,curr);
            if(unique==true)
            {
         ans.add(subans);
            }
            
        }
        return ans;
    }
}
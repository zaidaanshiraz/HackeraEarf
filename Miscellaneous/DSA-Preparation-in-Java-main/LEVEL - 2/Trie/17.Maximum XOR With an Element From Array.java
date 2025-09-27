//https://leetcode.com/problems/maximum-xor-with-an-element-from-array/

class Solution {
    public static class Node {
        Node left;
        Node right;
    }

    public void insert(Node root, int val) {
        for (int i = 31; i >= 0; i--) {
            int bit = val & (1 << i);

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
    }
        public int search(Node root, int val) {
        int maxXOR = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = val & (1 << i);

            if (bit == 0) {
                // pair exists with ith bit 1 -> XOR ith bit 1
                if (root.right != null) {
                    root = root.right;
                    maxXOR = maxXOR | (1 << i);
                } else {
                    root = root.left;
                }

            } else {
                // pair exists with ith bit 0 -> XOR ith bit 1
                if (root.left != null) {
                    root = root.left;
                    maxXOR = maxXOR | (1 << i);
                } else {
                    root = root.right;
                        // maxXOR = maxXOR ^ (1 << i);
                }
            }
        }
        return maxXOR;
    }
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int[][]q=new int[queries.length][3];
        for(int i=0;i<q.length;i++)
        {
            q[i]=new int[]{queries[i][0],queries[i][1],i};
        }
        
      Arrays.sort(q,(a,b)->(a[1]-b[1]));
        Arrays.sort(nums);
        int []res=new int[queries.length];
        int idx=0;
        Node root=new Node();
        for(int i=0;i<q.length;i++)
        {
            while(idx<nums.length&&nums[idx]<=q[i][1])
                insert(root,nums[idx++]);
            if(idx==0)
                res[q[i][2]]=-1;
            else
            res[q[i][2]]=search(root,q[i][0]);
        }
        return res;
    }
}
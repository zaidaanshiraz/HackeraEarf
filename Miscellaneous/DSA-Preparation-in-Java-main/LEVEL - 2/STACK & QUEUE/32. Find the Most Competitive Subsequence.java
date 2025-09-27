//https://leetcode.com/problems/find-the-most-competitive-subsequence/

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        k=nums.length-k;
               Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
 int ch=nums[i];
            while(q.size()>0&&q.getLast()>ch&&k>0)
            {
                q.removeLast();
                k--;
            }
            // if(ch!='0')
            q.addLast(ch);
        }

        while(k-->0)
            q.removeLast();
        // while(q.size()>0&&q.getFirst()==0)
            // q.removeFirst();
                if(q.size()==0) return new int[]{0};
     int []ans=new int[q.size()];
        int i=0;
        while(q.size()>0)
        {
            ans[i]=q.pop();
            i++;
        }
        return ans;
    }
}
//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans=Long.MAX_VALUE;
        for(int w=0;w<=(int)(n-m);w++)
        {
            long Max=a.get(w+(int)m-1);
            long Min=a.get(w);
            ans=Math.min(ans,Max-Min);
        }
        return ans;
    }
}
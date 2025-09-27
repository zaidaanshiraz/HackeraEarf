//https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        long ans=0;
        while(pq.size()>1)
        {
            long a=pq.remove();
            long b=pq.remove();
            ans+=a+b;
            pq.add(a+b);
        }
        // ans+=pq.peek();
        return ans;
    }
}
//https://practice.geeksforgeeks.org/problems/maximum-sum-of-subarray-less-than-or-equal-to-x4033/1

class Solution
{
    long findMaxSubarraySum(long arr[], int N,int X)
    {
        // Your code goes here
        long sum=0;
        long maxSum=0;
        int left=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>X)
            {
                sum-=arr[left];
                left++;
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
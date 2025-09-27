//https://leetcode.com/problems/subarray-product-less-than-k/

class Solution {
    long numSubarrayProductLessThanK(int arr[], int N,int X)
    {
        if(X<=1)
            return 0;
        // Your code goes here
        long prod=1;
        long count=0;
        int left=0;
        for(int i=0;i<arr.length;i++)
        {
            prod*=arr[i];
            while(prod>=X)
            {
                prod/=arr[left];
                left++;
            }
            count+=i-left+1;
        }
        return (int)count;
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return (int)numSubarrayProductLessThanK(nums,nums.length,k);
    }
}
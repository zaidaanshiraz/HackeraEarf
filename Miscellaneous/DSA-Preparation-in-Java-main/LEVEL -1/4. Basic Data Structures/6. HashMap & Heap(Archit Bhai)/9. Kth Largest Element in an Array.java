//https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public static int partition(int []nums,int l,int r,int k)
    {
        int j=l;
        for(int i=l;i<=r;i++)
        {
           if(nums[i]<=nums[r])
           {
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               j++;
           }
        }
        return j-1;
    }
    public static int findkLar(int []nums,int l,int r,int k)
    {
        if(l==r) return nums[l];
        int pivot=partition(nums,l,r,k);
        if(pivot==nums.length-k) return nums[pivot];
     else   if(pivot<nums.length-k) 
            return findkLar(nums,pivot+1,r,k);
      return findkLar(nums,l,pivot-1,k);  
    }
    public int findKthLargest(int[] nums, int k) {
        return findkLar(nums,0,nums.length-1,k);
    }
}
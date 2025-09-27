//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int leftmax=0;
        int rightmax=arr.length-1;
        int water=0;
        
        while(left<=right)
        {
            if(arr[left]<=arr[right])
            {
                if(arr[left]<arr[leftmax])
                    water+=arr[leftmax]-arr[left];
                else leftmax=left;
                left++;
            }
            else
            {
if(arr[right]<arr[rightmax])
                    water+=arr[rightmax]-arr[right];
                else rightmax=right;
                right--;
            }
        }
        return water;
    }
}
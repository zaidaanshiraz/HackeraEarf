////https://leetcode.com/problems/valid-triangle-number/

class Solution {
      public int findCount(int right,int[] nums, int target) {
        // Arrays.sort(nums);
          int left=0;
        int count=0;
        while(left<right)
        {
            if(nums[left]+nums[right]>target)
            {
               count+=right-left;
                right--;
            }
            else
                left++;
        }
    return count;   
    }
    public int triangleNumber(int[] arr) {
                Arrays.sort(arr);
        int count=0;
for(int i=arr.length-1;i>=2;i--)
{
    count+=findCount(i-1,arr,arr[i]);
}
return count;
    }
}
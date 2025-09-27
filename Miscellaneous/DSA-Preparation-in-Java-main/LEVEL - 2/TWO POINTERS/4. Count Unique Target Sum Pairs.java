//Only Code

class Solution {
    public int maxOperations(int[] nums, int target) {
        Arrays.sort(nums);
          int left=0,right=nums.length-1;
        int count=0;
        while(left<right)
        {
            if(left>0&&nums[left-1]==nums[left])
            continue;
            if(nums[left]+nums[right]==target)
            {
                left++;
                right--;
                count++;

            }
            else if(nums[left]+nums[right]<target)
                left++;
            else
                right--;
        }
    return count;   
    }
}
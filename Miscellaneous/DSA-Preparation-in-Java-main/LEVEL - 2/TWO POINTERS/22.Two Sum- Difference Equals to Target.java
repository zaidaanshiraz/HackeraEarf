//only Code

class Solution {
    public int[] twoSum(int[] nums, int target) {
     int left=0,right=1;
        
        while(left<nums.length&&right<nums.length)
        {
            if(left==right)
            {
                if(target>0)
                right++;
                else
                left++;
            }
            int diff=nums[right]-nums[left];
            if(diff==target)
            {
              return new int[]{nums[left],nums[right]};
            }
            else if(diff<target)
                right++;
            else
                left++;
        }
    return null;
}
}
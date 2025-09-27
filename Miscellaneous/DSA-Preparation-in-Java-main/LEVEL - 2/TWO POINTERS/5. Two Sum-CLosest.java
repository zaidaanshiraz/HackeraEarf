//ONLY Code
class Solution {
    public int maxOperations(int[] nums, int target) {
        Arrays.sort(nums);
          int left=0,right=nums.length-1;
        int abs=Integer.MAX_VALUE;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum==target)
            {
                return 0;

            }
            else if(sum<target)
               {
                abs=Math.min(abs,target-sum);
                left++;
               }
            else
            { abs=Math.min(abs,sum-target);
                right--;
            }
        }
    return abs;
    }
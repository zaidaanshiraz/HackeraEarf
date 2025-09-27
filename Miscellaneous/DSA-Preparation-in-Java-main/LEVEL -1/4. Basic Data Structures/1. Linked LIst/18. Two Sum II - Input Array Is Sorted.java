//Ques->https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/

//Code->
class Solution {
    public int[] twoSum(int[] nums, int target) {
     int left=0,right=nums.length-1;
          int []arr=new int[2];
        while(left<right)
        {
            if(nums[left]+nums[right]==target)
            {
              arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(nums[left]+nums[right]<target)
                left++;
            else
                right--;
        }
    return arr;
}
}
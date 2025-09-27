//Ques->https://leetcode.com/submissions/detail/692157932/

//Code
class Solution {
    public int rob(int[] nums) {
     int n=nums.length;
        if(n==1)
            return nums[0];
        int []dp=new int[n];
        dp[0]=nums[0];
        
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
          int no=dp[i-1];
            
            int yes=dp[i-2]+nums[i];
            dp[i]=Math.max(yes,no);
        }
        return dp[n-1];
            
    }
}
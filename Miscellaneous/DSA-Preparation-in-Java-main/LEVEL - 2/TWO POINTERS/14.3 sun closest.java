//https://leetcode.com/problems/3sum-closest/

class Solution {
    public int find(int left,int []nums,int tar)
    {
        int right=nums.length-1;
        int abs=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum==tar)
                return sum;
            else if(sum<tar)
            {
               int currAbs=Math.abs(sum-tar);
                if(currAbs<abs)
                {
                    abs=currAbs;
                    ans=sum;
                }
                left++;
            }else
            {
                 int currAbs=Math.abs(sum-tar);
                if(currAbs<abs)
                {
                    abs=currAbs;
                    ans=sum;
                }
                right--;
            }
        }
        return ans;
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        long abs=Integer.MAX_VALUE;
        long finalans=0;
     for(int i=0;i<=nums.length-3;i++)
     {
         long val=target-nums[i];
         long ans=find(i+1,nums,(int)val);
         long currSum=ans+nums[i];
         if(Math.abs(target-currSum)<abs)
         {
             abs=Math.abs(target-currSum);
             System.out.println(abs);
             finalans=currSum;
         }
     }
        return (int)finalans;
    }
}
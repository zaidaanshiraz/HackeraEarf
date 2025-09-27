//https://www.lintcode.com/problem/918//
public class Solution {
    /**
     * @param nums:  an array of n integers
     * @param target: a target
     * @return: the number of index triplets satisfy the condition nums[i] + nums[j] + nums[k] < target
     */
     public int find(int left,int []nums,int tar)
     {
         int right=nums.length-1;
         int count=0;
         while(left<right)
         {
          int sum=nums[left]+nums[right];
          if(sum<tar)
          {
              count+=right-left;
              left++;
          }
          else
          right--;
         }
         return count;
     }
    public int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        Arrays.sort(nums);

        int count=0;
        for(int i=0;i<=nums.length-3;i++)
        {
            int tar=target-nums[i];
            count+=find(i+1,nums,tar);
        }
        return count;
    }
}
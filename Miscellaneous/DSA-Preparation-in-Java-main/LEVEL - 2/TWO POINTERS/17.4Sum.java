//https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> twoSum(int []nums,int start,int target)
    {
        int left=start;
        int right=nums.length-1;
        List<List<Integer>> wholeList=new ArrayList<>();
        while(left<right)
        {
            if(left>start&&nums[left]==nums[left-1])
            {
                left++;
                continue;
            }
            int sum=nums[left]+nums[right];
            if(sum==target)
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(nums[left]);
                list.add(nums[right]);
                wholeList.add(list);
                left++;
                right--;
            }
            else if(sum<target)
                left++;
            else
                right--;
        }
        return wholeList;
    }
    public List<List<Integer>> kSum(int []nums,int start,int k,int target)
    {
        if(k==2)
        {
            return twoSum(nums,start ,target);
        }
        List<List<Integer>> res=new ArrayList<>();
for(int i=start;i<=nums.length-k;i++)
{
    if(i>start&&nums[i]==nums[i-1]) continue;
    List<List<Integer>> subRes=kSum(nums,i+1,k-1,target-nums[i]);
    for(List<Integer> sub:subRes)
    {
        sub.add(0,nums[i]);
        res.add(sub);
    }
}
        return res;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums,0,4,target);
    }
}
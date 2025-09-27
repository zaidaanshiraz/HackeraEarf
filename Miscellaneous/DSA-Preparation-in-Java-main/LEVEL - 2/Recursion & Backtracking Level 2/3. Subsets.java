///https://leetcode.com/problems/subsets/

class Solution {
    public static List<List<Integer>> getSubsets(int []nums,int idx)
    {
                List<List<Integer>> obj=new ArrayList<>();
        if(idx==nums.length)
        {
            obj.add(new ArrayList<>());
            return obj;
        }
        List<List<Integer>> someAns=getSubsets(nums,idx+1);

        for(List<Integer> subsets:someAns)
        {
            List<Integer> curr=new ArrayList<>();
            curr.add(nums[idx]);
            for(int a:subsets)
            {
                curr.add(a);
            }
            obj.add(curr);
            obj.add(subsets);
        }
        return obj;
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans=getSubsets(nums,0);
        return ans;
    }
}
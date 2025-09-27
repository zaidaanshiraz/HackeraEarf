//https://leetcode.com/problems/permutations/

class Solution {
 public static List<List<Integer>> res;
    public void swap(int [] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void permutations(int []nums,int currBox)
    {
        if(currBox==nums.length)
        {
            List<Integer> obj=new ArrayList<>();
for(int a:nums)
{
    obj.add(a);
}
            res.add(obj);
            return ;
        }
for(int i=currBox;i<nums.length;i++)
{
    swap(nums,currBox,i);
    permutations(nums,currBox+1);
    swap(nums,currBox,i);
}
    }
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        permutations(nums,0);
        return res;
    }
}
//https://leetcode.com/problems/permutations-ii/

class Solution {
  public static  List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res=new ArrayList<>();
        HashMap<Integer,Integer> lastIdx=new HashMap<>();
        for(int a:nums)
        {

            lastIdx.put(a,-1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            ans.add(null);
        permutations(ans,lastIdx,nums,0);
        return res;
    }
    public static void permutations(List<Integer> ans,HashMap<Integer,Integer> lastIdx,int[] nums,int currItem)
    {
if(currItem==nums.length)
{
    List<Integer> temp=new ArrayList<>(ans);
    res.add(temp);
    return ;
}
        int st=lastIdx.get(nums[currItem]);
        for(int i=st+1;i<nums.length;i++)
        {
            if(ans.get(i)==null)
            {
                ans.set(i,nums[currItem]);
                lastIdx.put(nums[currItem],i);
                permutations(ans,lastIdx,nums,currItem+1);
                ans.set(i,null);
                lastIdx.put(nums[currItem],st);
            }

        }
    }
}
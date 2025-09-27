//https://leetcode.com/problems/permutations-ii/

class Solution {
 public static   List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
       res =new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int a:nums)
        {
int currVal=freq.getOrDefault(a,0)+1;
            freq.put(a,currVal);
        }
        permutation(new ArrayList<>(),0,freq,nums);
        return res;
    }
    public static void permutation(ArrayList<Integer> ans,int currBox,HashMap<Integer,Integer> freq,int []nums)
    {
        if(currBox==nums.length)
        {
ArrayList<Integer> obj=new ArrayList<>(ans);
            res.add(obj);
            return ;
        }
for(Integer a:freq.keySet())
{
int val=freq.get(a);
    if(val>0)
    {
        ans.add(a);
        freq.put(a,val-1);
        permutation(ans,currBox+1,freq,nums);
        ans.remove(ans.size()-1);
        freq.put(a,val);
    }
}
    }
}
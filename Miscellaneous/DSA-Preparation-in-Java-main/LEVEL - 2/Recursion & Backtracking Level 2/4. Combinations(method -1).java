//https://leetcode.com/problems/combinations/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
List<List<Integer>> Combination=new ArrayList<>();
List<Integer> combinations =new ArrayList<>();
       getAns(Combination ,combinations,0,0,n,k);
        return Combination;
        
    }
    public void getAns(List<List<Integer>> Combination,List<Integer> combinations,int currK,int currNo,int n,int k)
    {
        if(currNo==n)
        {
if(combinations.size()==k)
{
List<Integer> base=new ArrayList<>(combinations);
    Combination.add(base);
    
}
            return ;
        }
 combinations.add(currNo+1);
        getAns(Combination,combinations,currK+1,currNo+1,n,k);
        combinations.remove(combinations.size()-1);
        
        getAns(Combination,combinations,currK+1,currNo+1,n,k);
    }
}
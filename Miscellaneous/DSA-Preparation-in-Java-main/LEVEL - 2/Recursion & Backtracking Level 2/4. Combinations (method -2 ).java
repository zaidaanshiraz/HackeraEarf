//https://leetcode.com/problems/combinations/

class Solution {
    List<List<Integer>> ans;
    public void findCombination(int boxNo,List<Integer> subans,int n,int k,int lastIdx)
    {
        if(boxNo==k)
        {
            // if(subans.size()==k)
            {
                // System.out.print(subans);
                List<Integer> obj=new ArrayList<>(subans);
                ans.add(obj);
            }
            return ;
        }
for(int i=lastIdx+1;i<=n;i++)
{
     
    subans.add(i);
    findCombination(boxNo+1,subans,n,k,i);
    subans.remove(subans.size()-1);
   
}
        //findCombination(boxNo+1,subans,n,k,lastIdx+1);

    }
    public List<List<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        
        findCombination(0,new ArrayList<>(),n,k,0);
        return ans;
    }
}
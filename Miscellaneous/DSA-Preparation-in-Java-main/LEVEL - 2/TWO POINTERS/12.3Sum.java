//https://leetcode.com/problems/3sum/

class Solution {

    public List<List<Integer>> find(int left,int tar,int []nums)
    {
        List<List<Integer>> wholeList=new ArrayList<>();
        int start=left;
        int right=nums.length-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(left>start&&nums[left]==nums[left-1]) 
            {left++;continue;}
            if(sum==tar)
            {
                
                ArrayList<Integer> list=new ArrayList<>();
                list.add(nums[left]);
                list.add(nums[right]);
                wholeList.add(list);
                left++;
                right--;
                
            }
            else if(sum<tar)
                left++;
            else 
                right--;
                
        }
        return wholeList;
    }
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
      for(int i=0;i<=nums.length-3;i++)
      {
          int tar=-nums[i];
          if(i>0&&nums[i]==nums[i-1]) continue;
          System.out.println(tar);
          List<List<Integer>> subans=find(i+1,tar,nums);
          for(List<Integer> list:subans)
          {
              System.out.println(list);
              list.add(0,nums[i]);
              res.add(list);
          }
      }
        return res;
        
    }
}
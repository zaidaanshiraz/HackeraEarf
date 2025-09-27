//Ques->https://leetcode.com/problems/triangle/

//Code
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
        // System.out.println("n"+n);
        int m=triangle.get(n-1).size();
        // System.out.println("m"+m);
        int []dp=new int[m];
    
    for(int j=0;j<m;j++)
    {
        dp[j]=triangle.get(n-1).get(j);
    }
for(int i=n-2;i>=0;i--)
{
    int []newdp=new int[m];
    m=triangle.get(i).size();
    for(int j=m-1;j>=0;j--)
    {
    newdp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
    }
    dp=newdp;
}
    
        return dp[0];
    }
}
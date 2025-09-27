//Ques->https://leetcode.com/problems/triangle/

//Code
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
        // System.out.println("n"+n);
        int m=triangle.get(n-1).size();
        // System.out.println("m"+m);
        int [][]dp=new int[n][m];
    
        
        for(int i=n-1;i>=0;i--)
        {
            m=triangle.get(i).size();
            for(int j=m-1;j>=0;j--)
            {
            if(i==n-1)
            {
                dp[i][j]=triangle.get(i).get(j);
            }
                else
                dp[i][j]=Math.min(dp[i+1][j+1],dp[i+1][j])+triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
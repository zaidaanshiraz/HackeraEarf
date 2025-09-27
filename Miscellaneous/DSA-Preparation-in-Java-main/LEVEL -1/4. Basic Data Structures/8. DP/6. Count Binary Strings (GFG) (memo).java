//Ques->https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1

class Solution {
  static  int mod=1000000007;
    long countStrings(int n) {
        // code here
        Long [][]dp=new Long[n+1][2];
     return  helper(n,0,dp);
    }
    public static long helper(int n,int prev,Long[][]dp)
    {
        if(n==0)
        return 1;
        if(dp[n][prev]!=null)
        return dp[n][prev];
       long zero= helper(n-1,0,dp);
       long one=0;
        if(prev!=1)
       one= helper(n-1,1,dp);
        
        return dp[n][prev]=(zero+one)%mod;
    }
}
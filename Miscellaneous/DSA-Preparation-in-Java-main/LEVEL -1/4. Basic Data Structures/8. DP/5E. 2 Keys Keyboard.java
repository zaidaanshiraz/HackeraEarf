//Ques->https://leetcode.com/problems/2-keys-keyboard/


//Code
class Solution {
    public int minSteps(int n) {
        if(n==1)
            return 0;
        if(n==2)
            return 2;
        // return n;
        Integer [][]dp=new Integer[n+1][n+1];
        //0 for copy
        //1 for paste
        return helper(2,1,dp,-1,n)+2;
    }
    public int helper(int lenstr,int lenbuff,Integer [][]dp,int prev,int n)
    {
        if(lenstr==n)
            return 0;
        if(lenstr>n)
            return Integer.MAX_VALUE;
        if(prev!=-1 &&dp[lenstr][lenbuff]!=null)
            return dp[lenstr][lenbuff];
        int ans0=Integer.MAX_VALUE;
        int ans1=Integer.MAX_VALUE;

        if(prev==1||prev==-1)
        {
           ans0= helper(lenstr,lenstr,dp,0,n);
        }
        ans1=helper(lenstr+lenbuff,lenbuff,dp,1,n);
        if(prev==-1)
            return Math.min(ans0,ans1)+1;
        return dp[lenstr][lenbuff]=(Math.min(ans0,ans1)!=Integer.MAX_VALUE)?Math.min(ans0,ans1)+1:Integer.MAX_VALUE;
    }
        
}
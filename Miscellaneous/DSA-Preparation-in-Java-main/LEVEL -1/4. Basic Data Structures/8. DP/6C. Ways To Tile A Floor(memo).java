//Ques->https://practice.geeksforgeeks.org/problems/ways-to-tile-a-floor5836/1/

//Code
class Solution {
    static Long numberOfWays(int N) {
        // code here
        Long []dp=new Long[N+1];
        return helper(N,dp);
    }
    static int mod=1000000007;
public static Long helper(int N,Long []dp)
{
    if(N<0)
    return 0l;
    if(N==0)
    return 1l;
    if(dp[N]!=null)
    return dp[N];
    long ans1=0,ans2=0;
   ans1= helper(N-1,dp);
   ans2= helper(N-2,dp);
   return dp[N]=(ans1+ans2)%mod;
}
};


//Ques->https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1#

//Code
class Solution
{
    public int mod=1000000007;
    public long countFriendsPairings(int n) 
    { 
       //code here
long []dp=new long[n+1];
Arrays.fill(dp,-1);
return countFriendsPairing(n,dp);
    }
    public long countFriendsPairing(int n,long[]dp)
    {
              if(n==0||n==1)
       return 1l;
       if(dp[n]!=-1)
       return dp[n];
       
       long single =countFriendsPairing(n-1,dp);
       long Pair=((n-1l)*countFriendsPairing(n-2,dp))%mod;
       
       return dp[n]=(single+Pair)%mod; 
    }
}    
 
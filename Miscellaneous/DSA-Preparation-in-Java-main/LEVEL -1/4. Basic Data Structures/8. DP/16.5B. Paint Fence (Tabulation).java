//Ques->https://nados.io/question/paint-fence?zen=true

//COde
public class Solution {
    /**
     * @param n: non-negative integer, n posts
     * @param k: non-negative integer, k colors
     * @return: an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // write your code here
        if(n==1) return k;
        if(n==2) return k*k;
        if(k==1) return 0;

        int []dp=new int[n+1];
Arrays.fill(dp,-1);
return memo(n,k,dp);

    }
    public int memo(int n,int k,int []dp)
    {
        if(n==1) return k;
        if(n==2) return k*k;

        if(dp[n]!=-1)
        return dp[n];

        int ans=(memo(n-1,k,dp)+memo(n-2,k,dp))*(k-1);

        return dp[n]=ans;
    }
}
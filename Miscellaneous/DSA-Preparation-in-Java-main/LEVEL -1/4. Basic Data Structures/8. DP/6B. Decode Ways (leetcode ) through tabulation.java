//https://leetcode.com/problems/decode-ways/

//Code
class Solution {
    public int numDecodings(String str) {
        if(str.charAt(0)=='0') return 0;
        int []dp=new int[str.length()+1];
        return memo(str,0,dp);
        
    }
    public int memo(String str,int idx ,int []dp)
    {
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            char chi=str.charAt(i-1);
            char chim1=str.charAt(i-2);
            if(chi!='0')
            {
                dp[i]=dp[i-1];
            }
            if(chim1!='0'&&Integer.parseInt(""+chim1+chi)<=26)
            {
                dp[i]+=dp[i-2];
            }
        }
    return dp[str.length()];
    }
}
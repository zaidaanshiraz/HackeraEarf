// 7) Count Non-Intersecting Chords in Circle
// Answer(n) = Catalan(n / 2)
// InterviewBit:
// https://www.interviewbit.com/problems/intersecting-chords-in-a-circle/

public class Solution {
    public int chordCnt(int n) {
          
           if(n==1)
           return 1;
           int mod=1000000007;
           
                          long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++){
            for (int j = 0; j < i; j++)
            {
               
                dp[i] += (dp[j] * dp[i - j - 1])%mod;
                dp[i]%=mod;
            }
          
    }
                
        return  (int)dp[n];
    }
}

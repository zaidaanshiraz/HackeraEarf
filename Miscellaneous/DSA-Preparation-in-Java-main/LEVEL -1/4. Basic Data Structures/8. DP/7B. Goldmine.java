//Ques->https://nados.io/question/goldmine?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]cost=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                cost[i][j]=scn.nextInt();
            }
        }
        int [][]dp=new int[n][m];
        for(int j=m-1;j>=0;j--)
        {
            for(int i=0;i<n;i++)
            {
                if(j==m-1)
                {
                    dp[i][j]=cost[i][j];
                }else if(i==0)
                {
                    dp[i][j]=cost[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==n-1)
                {
dp[i][j]=cost[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else
                {
dp[i][j]=cost[i][j]+Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]));
                }
            }
        }
        int ans=dp[0][0];
        for(int i=1;i<n;i++)
        {
            if(dp[i][0]>ans)
            ans=dp[i][0];
        }
        System.out.println(ans);
    }

}
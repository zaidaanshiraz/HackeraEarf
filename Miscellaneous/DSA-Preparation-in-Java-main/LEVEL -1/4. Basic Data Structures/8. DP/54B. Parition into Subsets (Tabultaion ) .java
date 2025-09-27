//Ques>https://nados.io/question/partition-into-subsets?zen=true

import java.io.*;
import java.util.*;

public class Main {
        
   
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        long  [][]dp=new long[n+1][k+1];
        
        
    dp[1][1]=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=k;j++)
        {
            if(i==1&&j==1)
            continue;
            long oneLessPpl=dp[i-1][j];
            oneLessPpl=oneLessPpl*j;
            long oneLessPplAndRoom=dp[i-1][j-1];
            dp[i][j]=oneLessPpl+oneLessPplAndRoom;
        }
    }
    System.out.println(dp[n][k]);
    }
}
//Ques>https://nados.io/question/partition-into-subsets?zen=true

import java.io.*;
import java.util.*;

public class Main {
        
   
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        long  []dp=new long[k+1];
        
        
    dp[1]=1;
    for(int i=2;i<=n;i++)
    {
        long []newdp=new long[k+1];
        for(int j=1;j<=k;j++)
        {
            
          long oneLessPpl=dp[j];
          oneLessPpl=j*oneLessPpl;
          long oneLessPplAndRoom=dp[j-1];
          newdp[j]=oneLessPpl+oneLessPplAndRoom;
        }
        dp=newdp;
    }
    System.out.println(dp[k]);
    }
}
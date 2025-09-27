//Ques->https://nados.io/question/paint-house?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int [][]costs=new int[n][3];
for(int i=0;i<n;i++)
{
    for(int j=0;j<3;j++)
    {
        costs[i][j]=scn.nextInt();
    }
}

System.out.println(minCost(costs));

    }
    public static int helper(int [][]costs,int idx,int prev,int [][]dp)
     {
         if(idx==costs.length)
         return 0;
         if(prev>=0&&dp[idx][prev]!=-1)
         return dp[idx][prev];
         int ansR=(prev==0)?Integer.MAX_VALUE:helper(costs,idx+1,0,dp)+costs[idx][0];
          int ansB=(prev==1)?Integer.MAX_VALUE:helper(costs,idx+1,1,dp)+costs[idx][1];
            int ansG=(prev==2)?Integer.MAX_VALUE:helper(costs,idx+1,2,dp)+costs[idx][2];
            if(prev==-1)
            return Math.min(ansR,Math.min(ansB,ansG));
            return dp[idx][prev]=Math.min(ansR,Math.min(ansB,ansG)); 
     }
    public static int minCost(int[][] costs) {
        // write your code here
        if(costs.length==0)
        return 0;
        int [][]dp=new int[costs.length+1][3];
        for(int i=0;i<=costs.length;i++)
        {
            dp[i][0]=-1;
            dp[i][1]=-1;
             dp[i][2]=-1;
        }
    return helper(costs,0,-1,dp);
    }

}
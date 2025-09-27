//Ques->https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

//Code
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int cap, int wt[], int cost[], int n) 
    { 
         // your code here 
         int [][]dp=new int[cap+1][cost.length];
         for(int i=00;i<=cap;i++)
         {
             for(int j=0;j<cost.length;j++)
             {
                 dp[i][j]=-1;
             }
         }
         return memo(cap,0,wt,cost,dp);
    } 
    static int memo(int cap,int item,int []wt,int []cost,int [][]dp)
    {
        if(item==cost.length) return 0;
        if(dp[cap][item]!=-1)
        return dp[cap][item];
        int yes=(cap>=wt[item])?memo(cap-wt[item],item+1,wt,cost,dp)+cost[item]:-1;
        int no=memo(cap,item+1,wt,cost,dp);
        
        return dp[cap][item]=Math.max(yes,no);
    }
}
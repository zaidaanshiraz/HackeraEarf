//Ques->https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

//Code
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int caps, int wt[], int cost[], int n) 
    { 
         // your code here 
                 int [][]dp=new int[caps+1][cost.length+1];
        for(int item=1;item<=cost.length;item++)
        {
            for(int cap=1;cap<=caps;cap++)
            {
                int no=dp[cap][item-1];
                int yes=(cap>=wt[item-1])?cost[item-1]+dp[cap-wt[item-1]][item-1]:-1;
                
                
                dp[cap][item]=Math.max(yes,no);
            }
        }
        return dp[caps][cost.length];
    } 
}
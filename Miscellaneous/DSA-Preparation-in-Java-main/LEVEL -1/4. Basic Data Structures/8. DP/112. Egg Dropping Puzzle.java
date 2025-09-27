//Ques->https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1

class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
 static int eggDrop(int floors, int eggs, int[][] dp){
        if(floors == 0) return 0;
        if(eggs == 1) return floors;
        if(dp[floors][eggs] != -1) return dp[floors][eggs];
        
        int min = floors;
        for(int i=1; i<=floors; i++){
            int eggBreak = eggDrop(i - 1, eggs - 1, dp);
            int eggSurvive = eggDrop(floors - i, eggs, dp);
            
            min = Math.min(min, 1 + Math.max(eggBreak, eggSurvive));
        }
        
        return dp[floors][eggs] = min;
    }
    
    static int eggDrop(int eggs, int floors) 
    {
         int[][] dp = new int[floors + 1][eggs + 1];
         for(int i=0; i<=floors; i++){
             for(int j=0; j<=eggs; j++){
                 dp[i][j] = -1;
             }
         }
         
         return eggDrop(floors, eggs, dp);
    }
}
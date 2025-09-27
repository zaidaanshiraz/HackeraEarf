//Ques-https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1

class Solution{
    public int perfectSum(int arr[],int n, int target) 
	{ 
	    int[] dp = new int[target + 1];
	    dp[0] = 1; // Empty Subset to form 0 Target
	    
	    for(int i=1; i<=n; i++){
	        int[] newdp = new int[target + 1];
	        
	        for(int j=0; j<=target; j++){
	            int no = dp[j]; // No Call
	            int yes = (j >= arr[i - 1]) ? dp[j - arr[i - 1]] : 0;
	            
	            newdp[j] = (no + yes) % 1000000007;
	        }
	        
	        dp = newdp;
	    }
	    
	    return dp[target];
	} 
}
//Ques->https://practice.geeksforgeeks.org/problems/minimum-steps-to-minimize-n-as-per-given-condition0618/1

//Code
class Solution{

	public int minSteps(int N) 
	{ 
	    // Your code goes here
	    int []dp=new int[N+1];
	    Arrays.fill(dp,-1);
	    return helper(N,dp);
	} 
	public static int helper(int N,int []dp)
	{

	    if(N==1)
	    return 0;
	    if(dp[N]!=-1)
	    return dp[N];
	    int mov1=Integer.MAX_VALUE,mov2=Integer.MAX_VALUE;
	    if(N%2==0)
	     mov1=helper(N/2,dp);
	    if(N%3==0)
	     mov2=helper(N/3,dp);
	   int  mov3=helper(N-1,dp);
	    
	    return dp[N]=Math.min(Math.min(mov1,mov2),mov3)+1;
	    
	}
}
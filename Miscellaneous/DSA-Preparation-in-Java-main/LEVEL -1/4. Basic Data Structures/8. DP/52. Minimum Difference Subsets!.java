////Ques->https://www.interviewbit.com/problems/minimum-difference-subsets/

//Code
public class Solution {
    public int solve(int[] arr) {
        int total=0;
        for(int val:arr)
        total+=val;
int n=arr.length;

        boolean []dp=new boolean[total+1];
        dp[0]=true;
     for(int i=1;i<=n;i++){
        boolean []newdp=new boolean[total+1];

for(int j=0;j<=total;j++)
{
    boolean no=dp[j];
    boolean yes=(j>=arr[i-1]?dp[j-arr[i-1]]:false);

    newdp[j]=no||yes;
}
dp=newdp;
    }
int half=(total+1)/2;
for(int s1=half;s1<=total;s1++)
{
    if(dp[s1]==true)
    {
        return (s1-(total-s1));
    }
}
return total;
}

}
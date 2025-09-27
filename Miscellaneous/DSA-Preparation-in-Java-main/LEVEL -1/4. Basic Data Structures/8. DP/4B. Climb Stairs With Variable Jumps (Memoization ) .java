//Ques->https://nados.io/question/climb-stairs-with-variable-jumps?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []jumps=new int[n];
        for(int i=0;i<n;i++)
        {
            jumps[i]=scn.nextInt();
        }
        Integer []dp=new Integer[n+1];
        System.out.println(memo(0,jumps,dp));
    }
    public static int memo(int n,int []jumps,Integer[]dp)
    {
        if(n==jumps.length) return 1;
        if(dp[n]!=null)
        return dp[n];
        
        int ans=0;
        for(int i=1;i<=jumps[n];i++)
        {
if(n+i<=jumps.length)
ans+=memo(n+i,jumps,dp);
        }
        dp[n]=ans;
        return ans;
    }

}
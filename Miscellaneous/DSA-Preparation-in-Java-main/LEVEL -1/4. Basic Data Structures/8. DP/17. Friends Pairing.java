//Ques->https://nados.io/question/friends-pairing?zen=true

//COde
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+(dp[i-2]*(i-1));
        }
        System.out.println(dp[n]);
    }

}
//Ques->https://nados.io/question/coin-change-permutations?zen=true

//COde
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int []coins=new int[n];
for(int i=0;i<coins.length;i++)
{
    coins[i]=scn.nextInt();
}
int amt=scn.nextInt();
int []dp=new int[amt+1];
dp[0]=1;
 for(int tar=1;tar<=amt;tar++)
{
   for(int coin:coins)
    {
        if(tar>=coin)
        {
            dp[tar]+=dp[tar-coin];
        }
    }
}
    System.out.println(dp[amt]);
    }

}
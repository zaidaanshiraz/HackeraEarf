// 2) Count Balanced Parentheses
// Answer(n) = Catalan(n)
// NADOS: https://nados.io/question/count-brackets?zen=true

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

              int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j] * dp[i - j - 1];
        System.out.println(dp[n]);
 }

}
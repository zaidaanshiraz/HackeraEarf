//Ques->https://nados.io/question/climb-stairs?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int paths=climbStairs(n);
        System.out.println(paths);
    }
    public static int climbStairs(int n)
    {
        int []strg=new int[n+1];
        strg[0]=1;
        for(int i=1;i<=n;i++)
        {
            if(i-1>=0)
            {
                strg[i]+=strg[i-1];
            }
             if(i-2>=0)
            {
                strg[i]+=strg[i-2];
            }
             if(i-3>=0)
            {
                strg[i]+=strg[i-3];
            }
        }
        return strg[n];
    }

}
//Ques->https://nados.io/question/climb-stairs?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int paths=climbStairs(n,new Integer[n+1]);
        System.out.println(paths);
    }
    public static int climbStairs(int n,Integer[] strg)
    {
        if(n==0)
        {
            return 1;
        }else if(n<0)
        {
            return 0;
        }
        if(strg[n]!=null)
        {
            return strg[n];
        }
        int pnm1=climbStairs(n-1,strg);
        int pnm2=climbStairs(n-2,strg);
         int pnm3=climbStairs(n-3,strg);
         int paths=pnm1+pnm2+pnm3;
         strg[n]=paths;
         return paths;
    }

}
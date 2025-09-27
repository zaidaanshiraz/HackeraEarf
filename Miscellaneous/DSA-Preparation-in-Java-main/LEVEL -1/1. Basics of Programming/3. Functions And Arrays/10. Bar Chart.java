//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        int n;
        Scanner scn =new Scanner(System.in);
        n=scn.nextInt();
        int [] a = new int[n];
        for(int t=0;t<n;t++)
        {
            a[t]=scn.nextInt();
        }
        int max = maxnum(a);
        for(int i=max;i>0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=a[j])
                    System.out.print("*	");
                else
                    System.out.print("	");

            }
            System.out.println();
        }
    }
    static int maxnum(int [] a)
    {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
            res=Math.max(a[i],res);
        return res;
    }

}
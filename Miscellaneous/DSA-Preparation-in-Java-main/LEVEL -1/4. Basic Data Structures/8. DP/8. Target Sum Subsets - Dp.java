//Ques->https://nados.io/question/target-sum-subsets-dp?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++)
{
    arr[i]=scn.nextInt();
}
int tar=scn.nextInt();
boolean [][]strg=new boolean[n+1][tar+1];
for(int i=0;i<strg.length;i++)
{
    for(int j=0;j<strg[0].length;j++)
    {
        if(i==0&&j==0)
        {
            strg[i][j]=true;
        }
        else if(i==0)
        {
            strg[i][j]=false;
        }
        else if(j==0)
        {
            strg[i][j]=true;
        }
        else{
            strg[i][j]=strg[i-1][j];
            int val=arr[i-1];
            if(j>=val&&strg[i-1][j-val])
            {
                strg[i][j]=true;
            }
        }
    }
}
System.out.println(strg[n][tar]);
    }
}
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-permutations-2das2d-box-chooses-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void queensPermutations(int qpsf, int tq, int cellNo,String mat,boolean[]vis) {
        // write your code here
        if(cellNo==tq*tq)
        {
            if(qpsf==tq)
            {
                System.out.println(mat);
                System.out.println();
            }
            return ;
        }
        if(cellNo%tq==tq-1)
        {
for(int i=0;i<tq;i++)
{
    if(vis[i]==false)
    {
        vis[i]=true;
        queensPermutations(qpsf+1,tq,cellNo+1,mat+"q"+(i+1)+"\t\n",vis);
        vis[i]=false;
    }
}
        queensPermutations(qpsf,tq,cellNo+1,mat+"-\t\n",vis);
            
        }else
        {
for(int i=0;i<tq;i++)
{
    if(vis[i]==false)
    {
        vis[i]=true;
        queensPermutations(qpsf+1,tq,cellNo+1,mat+"q"+(i+1)+"\t",vis);
        vis[i]=false;
    }
}
        queensPermutations(qpsf,tq,cellNo+1,mat+"-\t",vis);
        }
        
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] queens = new boolean[n];

        queensPermutations(0, n,0, "", queens);
    }
}
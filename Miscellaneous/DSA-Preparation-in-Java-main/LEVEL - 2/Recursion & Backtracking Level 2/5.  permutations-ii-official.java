//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutations-ii-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {
static int ans=0;
  public static void permutations(int currBox, int nboxes, int ritems, String asf,int []taken,int count){
    // write your code here
    // System.out.println(currBox);
    if(currBox==nboxes)
    {
        // System.out.println(count);
        if(count==ritems)
        { ans++;
        System.out.println(asf);
        }
        return ;
    }
    for(int i=1;i<=ritems;i++)
    {
        if(taken[i]==0){
        taken[i]=1;
    permutations(currBox+1,nboxes,ritems,asf+i,taken,count+1);
        taken[i]=0;
       }
        }
         permutations(currBox+1,nboxes,ritems,asf+"0",taken,count);
    }
  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(0,nboxes,ritems,"",new int[ritems+1],0);
    // System.out.println(ans);
  }

}
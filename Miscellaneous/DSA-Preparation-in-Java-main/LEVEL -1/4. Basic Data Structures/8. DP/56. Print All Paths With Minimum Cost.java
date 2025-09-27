//Ques->https://nados.io/question/print-all-paths-with-minimum-cost?zen=true

import java.io.*;
import java.util.*;

public class Main {

   private static class Pair {
      String psf;
      int i;
      int j;

      public Pair(String psf, int i, int j) {
         this.psf = psf;
         this.i = i;
         this.j = j;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] grid = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            grid[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }

      //write your code here
    int [][]dp=minPathSum(grid);
      System.out.println(dp[0][0]);
      DFS(0,0,dp,"");
      
            
        

   }
   public static void DFS(int row,int col,int [][]dp,String psf)
   {
      if(row==dp.length-1&&col==dp[0].length-1)
      {
         System.out.println(psf);
         return ;
      }
      int min=Integer.MAX_VALUE;
   if(row==dp.length-1)
  { min=dp[row][col+1];

 DFS(row,col+1,dp,psf+"H");
  }
   else if(col==dp[0].length-1)
   {
   min=dp[row+1][col];
DFS(row+1,col,dp,psf+"V");
   }
   else 
   {
   min=Math.min(dp[row][col+1],dp[row+1][col]);
   if(dp[row+1][col]==min)
   {
      DFS(row+1,col,dp,psf+"V");
   }
   if(dp[row][col+1]==min)
   {
      DFS(row,col+1,dp,psf+"H");
   }
   }

   
   }
   public static int[][] minPathSum(int [][]grid)
{
   
   int n=grid.length;
   int m= grid[0].length;
   int [][]dp=new int[n][m];
       for(int i=n-1; i>=0; i--){
                for(int j=m-1; j>=0; j--){
               if(i==n-1&&j==m-1)
               {dp[i][j]=grid[i][j];
               continue;}
if(j==m-1)
{
   dp[i][j]=dp[i+1][j]+grid[i][j];
   continue;
}
if(i==n-1)
{
    dp[i][j]=dp[i][j+1]+grid[i][j];
   continue;
}
 dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+grid[i][j];
                 }
                }

    return dp;
}
}
   


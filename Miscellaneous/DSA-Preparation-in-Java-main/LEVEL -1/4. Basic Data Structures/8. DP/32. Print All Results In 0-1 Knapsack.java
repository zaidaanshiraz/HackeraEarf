//Ques->https://nados.io/question/print-all-results-in-0-1-knapsack?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {
    public static class Pair{
        int row;
        int col;
        String psf;
        Pair(int row,int col,String psf)
        {
            this.row=row;
            this.col=col;
            this.psf=psf;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] values = new int[n];
        String str1 = br.readLine();
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(str1.split(" ")[i]);
        }

        int[] wt = new int[n];
        String str2 = br.readLine();
        for (int i = 0; i < n; i++) {
            wt[i] = Integer.parseInt(str2.split(" ")[i]);
        }

        int caps = Integer.parseInt(br.readLine());

        //write your code here
         int[][] dp = new int[caps+1][values.length+1];
        
        for(int item=1; item<=values.length; item++){
            for(int cap=1; cap<=caps; cap++){
                
                int no = dp[cap][item-1];
                int yes = (cap >= wt[item - 1]) 
                        ? values[item - 1] + dp[cap-wt[item-1]][item - 1]
                        : -1;
                        
                dp[cap][item] = Math.max(yes, no);
            }   
      
        }
        System.out.println(dp[caps][values.length]);
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(caps,values.length,""));
        while(q.size()>0)
        {
            Pair top=q.remove();
            int row=top.row;
            int col=top.col;
            String psf=top.psf;
            if(top.col==0)
            {
                System.out.println(top.psf);
                continue;
            }
            if(row>=wt[col-1]&&dp[row][col]==values[col-1]+dp[row-wt[col-1]][col-1])
            {
                q.add(new Pair(row-wt[col-1],col-1,(col-1)+" "+psf));
            }
            if(dp[row][col]==dp[row][col-1])
            {
                q.add(new Pair(row,col-1,psf));
            }
         
        }
    }
}


                        


                        


                        
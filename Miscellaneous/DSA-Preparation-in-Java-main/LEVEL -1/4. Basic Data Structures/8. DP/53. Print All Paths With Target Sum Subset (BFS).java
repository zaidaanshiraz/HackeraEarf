//Ques->https://nados.io/question/print-all-paths-with-target-sum-subset?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static class Pair{
        int row;
        int col;
        String psf;

        public Pair(int row, int col, String psf){
            this.row = row;
            this.col = col;
            this.psf = psf;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());

int yes=0;
int no=0;
        //write your code here
        int [][]dp=new int[n+1][tar+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=tar;j++)
            {
                 no=dp[i-1][j];
                if(j>=arr[i-1])
                 yes=dp[i-1][j-arr[i-1]];
                dp[i][j]=yes+no;
            }
        }
        if(dp[n][tar]>0)
        System.out.println(true);
        else
        System.out.println(false);
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(n,tar,""));
        while(q.size()>0)
        {
            Pair curr=q.remove();
            if(curr.row==0&&curr.col==0)
            {
                System.out.println(curr.psf);
                continue;
            }
            int row=curr.row;
            int item=arr[row-1];
            int col=curr.col;
            //No
            if(dp[row-1][col]>0)
            {
                q.add(new Pair(row-1,col,curr.psf));
            }
            //yes
            if(col>=item&&dp[row-1][col-item]>0)
            {
                q.add(new Pair(row-1,col-item,(row-1)+""+curr.psf));
            }
                    }

    }
}


                        


                        
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/nqueens-permutations-2das1d-official-queen-chooses/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static boolean isQueenSafe( int r, int c,int[][] vis) {
        // write your code here
          for(int j=0; j<c; j++){
            if(vis[r][j] >0)
                return false;
        }
        // col (up)
        for(int i=0; i<r; i++){
            if(vis[i][c] >0)
                return false;
        }

        // left diagnol (up)
        int i = r, j = c;
        while(i >= 0 && j >= 0){
            if(vis[i][j] >0){
                return false;
            }
            i--; j--;
        }

        // right diagnol (down)
        i = r; j = c;
        while(j < vis.length && i >= 0){
            if(vis[i][j] >0){
                return false;
            }
            i--; j++;
        }

        return true;
    }

    public static void nqueens(int qpsf, int r,int c,boolean[] queenPlaced, int[][] chess) {
        // write your code here
        int n=queenPlaced.length;
        if(qpsf==n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(chess[i][j]>0)
                    System.out.print("q"+chess[i][j]+"\t");
                    else
                    System.out.print("-\t");
                }
                            System.out.println();
            }
            System.out.println();
            return ;
        }
        if(r==n ) return ;
        if(c==n-1)
        nqueens(qpsf,r+1,0,queenPlaced,chess);
        else
                nqueens(qpsf,r,c+1,queenPlaced,chess);
                
        for(int i=0;i<n;i++)
        {
            if(queenPlaced[i]==false&&isQueenSafe(r,c,chess))
            {
                queenPlaced[i]=true;
                chess[r][c]=(i+1);
                if(c==n-1)
                nqueens(qpsf+1,r+1,0,queenPlaced,chess);
                else
                                nqueens(qpsf+1,r,c+1,queenPlaced,chess);
chess[r][c]=0;
queenPlaced[i]=false;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        boolean []queenPlaced=new boolean[n];

        nqueens(0,0,0, queenPlaced, chess);
    }
}
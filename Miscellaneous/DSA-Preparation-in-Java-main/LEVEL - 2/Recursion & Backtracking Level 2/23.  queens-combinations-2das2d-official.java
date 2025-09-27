//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das2d-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, Character[][] chess, int lastQueenRow,int lastQueenCol){
        // write your code here
        if(qpsf==tq)
        {
            for(int i=0;i<tq;i++)
            {
                for(int j=0;j<tq;j++)
                {
                    System.out.print(chess[i][j]+"\t");
                }
                System.out.println();
                
            }
            System.out.println();
            return ;
        }
        for(int j=lastQueenCol+1;j<tq;j++)
        {
            if(chess[lastQueenRow][j]=='-')
            {
                chess[lastQueenRow][j]='q';
                queensCombinations(qpsf+1,tq,chess,lastQueenRow,j);
                chess[lastQueenRow][j]='-';
            }
        }
        for(int i=lastQueenRow+1;i<tq;i++)
        {
            for(int j=0;j<tq;j++)
            {
                if(chess[i][j]=='-')
            {
                chess[i][j]='q';
                queensCombinations(qpsf+1,tq,chess,i,j);
                chess[i][j]='-';
            }
                
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Character[][] chess = new Character[n][n];
        for(int i=0;i<chess.length;i++)
        {
        for(int j=0;j<chess[0].length;j++)
        chess[i][j]='-';
        }
        queensCombinations(0, n, chess, 0,-1);
    }
}
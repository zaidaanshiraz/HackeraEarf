//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das2d-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qsf, int tq, Character[][] chess, int lastcellNo){
        // write your code here
        if(qsf==tq)
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
        for(int c=lastcellNo+1;c<tq*tq;c++)
        {
            int rowNo=c/tq;
            int colNo=c%tq;
            chess[rowNo][colNo]='q';
            queensCombinations(qsf+1,tq,chess,c);
            chess[rowNo][colNo]='-';
        }

        

}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Character[][] chess = new Character[n][n];
        
        for(int i=0;i<chess.length;i++)
        for(int j=0;j<chess[0].length;j++)
        chess[i][j]='-';
        
        queensCombinations(0, n, chess, -1);
    }
}
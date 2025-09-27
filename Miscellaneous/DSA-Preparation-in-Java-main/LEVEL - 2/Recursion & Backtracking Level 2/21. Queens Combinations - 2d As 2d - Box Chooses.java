//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das2d-box-chooses-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, int row,int col, String mat){
        // write your code here
    if(row==tq)
    {
        if(qpsf==tq)
        {
            System.out.println(mat);
        }
        return ;
    }
    if(col==tq-1)
    {
        //apni row ka last element agli row ke phele element par jana hai
        queensCombinations(qpsf+1,tq,row+1,0,mat+'q'+'\n');// yes
        queensCombinations(qpsf,tq,row+1,0,mat+'-'+'\n');//no
    
    }
    else
    {
        queensCombinations(qpsf+1,tq,row,col+1,mat+'q');//yes
        queensCombinations(qpsf,tq,row,col+1,mat+'-');//no
        
    }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensCombinations(0, n, 0,0,"");
    }
}
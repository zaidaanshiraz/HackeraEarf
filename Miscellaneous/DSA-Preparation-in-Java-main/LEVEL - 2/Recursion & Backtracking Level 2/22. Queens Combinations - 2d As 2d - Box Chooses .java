//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das2d-box-chooses-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, int cellNo, String mat){
        // write your code here
    if(cellNo==tq*tq)
    {
        if(qpsf==tq)
        {
            System.out.println(mat);
        }
        return ;
    }
    if(cellNo%tq==tq-1)
    {
        //apni row ka last element agli row ke phele element par jana hai
        queensCombinations(qpsf+1,tq,cellNo+1,mat+'q'+'\n');// yes
        queensCombinations(qpsf,tq,cellNo+1,mat+'-'+'\n');//no
    
    }
    else
    {
        queensCombinations(qpsf+1,tq,cellNo+1,mat+'q');//yes
        queensCombinations(qpsf,tq,cellNo+1,mat+'-');//no
        
    }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensCombinations(0, n,0,"");
    }
}
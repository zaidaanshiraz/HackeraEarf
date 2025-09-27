//Ques->https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/exit-point-matrix-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int m= scn.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0 ;i<n;i++)
        {
            for(int j=0;j<m;j++)
            arr[i][j]=scn.nextInt();
            
        }
    
        int dir=0,prevrow=0,prevcol=0,row=0,col=0;
        while(row<n&&col<m&&row>=0&&col>=0)
    {    
    if(arr[row][col]==1)
            dir=(dir+1)%4;
             prevrow=row;
            prevcol=col;
           
            if(dir==0)
            col++;
          else  if(dir==1)
            row++;
          else  if(dir==2)
            col--;
          else  if(dir==3)
            row--;
            
        }
        System.out.println(prevrow);
        System.out.println(prevcol);
    }

}
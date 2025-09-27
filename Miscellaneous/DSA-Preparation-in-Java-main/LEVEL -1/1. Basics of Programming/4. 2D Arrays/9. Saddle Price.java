//Ques->https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/saddle-price-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=scn.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //         System.out.print(arr[i][j]);
        //     System.out.println();}
         int minI=0,maxI=0,count=0;
        int minJ=0,maxJ=0;
        for(int i=0;i<n;i++)
        {
            int min=arr[i][0];
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]<=min)
                { min=arr[i][j];
                    minI=i;
                    minJ=j;

                }
            }
            int max=arr[minI][minJ];
            for(int k=0;k<n;k++)
            {

                if(arr[k][minJ]>=max)
                {
                    max=arr[k][minJ];
                    maxI=k;
                    maxJ=minJ;

                }
            }
            if(minI==maxI&&minJ==maxJ){
                System.out.println(arr[minI][minJ]);
                count++;}
        }
        if(count==0)
            System.out.println("Invalid input");

    }

}
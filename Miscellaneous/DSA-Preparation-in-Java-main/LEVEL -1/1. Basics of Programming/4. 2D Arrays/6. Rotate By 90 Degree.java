//Ques->https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/rotate-by-90-degree-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
      //  int m= scn.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0 ;i<n;i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j]=scn.nextInt();
            }
       //     display(arr);
             for(int i=0 ;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            swap(arr,i,j);
            }
        //    display(arr
         //   );
            int fcol=0,lcol=n-1;
        swapcol(arr,fcol,lcol,n);
         display(arr);
    
    }
    public static void swapcol(int a[][] ,int fcol,int lcol,int n)
    {
        while(fcol<lcol)
        {
            for(int k=0;k<n;k++)
            {
                int temp =a[k][fcol];
                a[k][fcol]=a[k][lcol];
                a[k][lcol]=temp;
            }fcol++;
            lcol--;
        }
    }
    public static void swap(int a[][],int i,int j)
    {
        int temp =a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
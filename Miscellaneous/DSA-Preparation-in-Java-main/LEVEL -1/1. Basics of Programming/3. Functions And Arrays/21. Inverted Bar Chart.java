//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverted-bar-chart-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int[n];
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {arr[i]=scn.nextInt();
    if(max<arr[i])
    max=arr[i];
    }
    while(max>0)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {System.out.print("*	");
            arr[i]--;
            }
            else
            System.out.print("    ");
        }
        System.out.println();
        max--;
    }
    
  }
  

}

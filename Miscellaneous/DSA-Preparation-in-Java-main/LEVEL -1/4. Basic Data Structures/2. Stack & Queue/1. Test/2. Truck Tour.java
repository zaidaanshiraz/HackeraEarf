//Ques->https://www.hackerrank.com/challenges/truck-tour/problem


//Code->
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
  
    public static void main(String[] args) throws IOException {
Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
            int [][]arr=new int[2][n];

      for(int j=0;j<n;j++)
      {
        for(int i=0;i<2;i++)
        {
          arr[i][j]=scn.nextInt();
        }
      }
      int start=0;
      int requiredFuel=0;
      int extraFuel=0;
      for(int j=0;j<arr[0].length;j++)
      {
        extraFuel+=arr[0][j]-arr[1][j];
        if(extraFuel<0)
        {
          start=j+1;
          requiredFuel+=extraFuel;
          extraFuel=0;
        }
      }
if(extraFuel+requiredFuel>=0)
  System.out.println(start);

    }
}

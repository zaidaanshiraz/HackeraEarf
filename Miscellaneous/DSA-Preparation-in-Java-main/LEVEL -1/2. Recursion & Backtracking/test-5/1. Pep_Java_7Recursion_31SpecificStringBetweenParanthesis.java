/*Ques->1.Take as input String.

The string contains pairs of parenthesis “(..)”.
Write a recursive function which returns the contents between the parenthesis.

Example(To be used only for expected output):

Input:
xyz(abc)def

output
(abc)
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output.

Sample Input 0

xyz(pepcoding)def
Sample Output 0

(pepcoding)*/

//Code
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      
      String str=scn.next();
      int flag=0;
    result(str,flag,"");
    
    }
  public static void result(String ques,int flag,String ans)
  {     
    int first=-1;
    int last=-1;
    int i=0;
    for(;i<ques.length();i++)
    {
      char ch=ques.charAt(i);
      if(ch=='('&&flag==0)
      {
        first=i;
        flag=1;
      }
      if(ch==')'&&first!=-1)
      {
        last=i;
        flag=0;
        break;
      }
    }
    if(i==ques.length())
    {
      System.out.println(ans);
      return ;
    }
    String content=ques.substring(first,last+1);
String rem=ques.substring(last+1);
    result(rem,flag,ans+content);
  }
    
}
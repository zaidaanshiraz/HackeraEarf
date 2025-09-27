/*Ques->1.Take as input String.

Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, .... z=26.
Write a recursive function (return type void) to print all possible codes for
the string.

Example(To be used only for expected output):

Input:
1123

output
aabc
aaw
alc
kbc
kw
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output.

Sample Input 0

1123
Sample Output 0

aabc
aaw
alc
kbc
kw*/

//Code
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      printAns(str,"");
      
    }
  public static void printAns(String ques,String ans)
  {
    if(ques.length()==0)
    {
      System.out.println(ans);
      return ;
    }
    char ch=ques.charAt(0);
    String rem=ques.substring(1);
    if(ch!='0')
    {
      char chartoAlpha=(char)('a'+(ch-'0')-1);
    printAns(rem,ans+chartoAlpha);
    }
    if(ques.length()>=2)
    {
    String first2=ques.substring(0,2);
    String rem1=ques.substring(2);
    int val=Integer.parseInt(first2);
      if(val>=10&&val<=26)
      {
        char alpha=(char)('a'+val-1);
        printAns(rem1,ans+alpha);
      }
    }
  }
}
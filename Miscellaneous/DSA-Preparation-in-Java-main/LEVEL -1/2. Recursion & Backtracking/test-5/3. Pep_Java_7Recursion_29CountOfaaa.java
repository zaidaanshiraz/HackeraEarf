/*Ques->1.Take as input String.

a. Write a recursive function which counts, the number of times “aaa”
appears in the string. Print the value returned.

b. Write a recursive function which counts, the number of times “aaa”
appears in the string, but only such instances of “aaa” should be
considered which do not overlap. Print the value returned.

Example(To be used only for expected output):

Input:
aaaaaa

output
4
2
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print Output.

Sample Input 0

aaaaaa
Sample Output 0

4
2*/

//Code
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      int ans=getAAA(str);
      System.out.println(ans);
      ans=0;
      ans=getAAAnoOverlap(str,0,0);
       System.out.println(ans);
    }
  public static int getAAAnoOverlap(String str,int count,int ans)
  {
    if(str.length()<3)
      return count;
    if(str.substring(0,3).equals("aaa"))
       ans=getAAAnoOverlap(str.substring(3),count+1,ans);
    else
      ans=getAAAnoOverlap(str.substring(1),count,ans); 
    return ans;
  }
  public static int getAAA(String str)
  {
    if(str.length()<3)
      return 0;
     int ans=getAAA(str.substring(1));
    if(str.substring(0,3).equals("aaa"))
      return ans+1;
    return ans;
  }
}
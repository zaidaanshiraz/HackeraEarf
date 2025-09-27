/*Ques->Given the array A consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input Format

First line of each test case starts with an integer N denoting the size of the array A.
Next line of input contains 2n space separated integers, where the ith integer denotes the value Ai.
Constraints

1 <= n <= 500
A.length == 2n
1 <= A[i] <= 10^3
Output Format

For each test case, print the resultant array after mixing.
Sample Input 0

3
2 5 1 3 4 7
Sample Output 0

2 3 5 4 1 7
Explanation 0

Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Sample Input 1

4
1 2 3 4 4 3 2 1
Sample Output 1

1 4 2 3 3 2 4 1
Explanation 1

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Sample Input 2

2
1 1 2 2
Sample Output 2

1 2 1 2
Explanation 2

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]*/

//Code
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int [] a=new int[2*n];
       int [] b=new int[2*n];
      for(int m=0;m<2*n;m++)
        a[m]=scn.nextInt();
      int j=0,k;
      boolean found=true;
      k=n;
      for(int i=0;i<2*n;i++)
      {
if(found)
{
  b[i]=a[j++];
  
}
else
{
  b[i]=a[k++];
}
        found=!found;
        
      } 
      for(int t=0;t<2*n;t++)
        System.out.print(b[t]+" ");
    }
}
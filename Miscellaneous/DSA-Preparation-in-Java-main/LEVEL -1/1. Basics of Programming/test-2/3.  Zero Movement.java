/*Ques->Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Input Format

First line of each test case starts with an integer N denoting the size of the array nums.
Next line of input contains N space separated integers, where the ith integer denotes the value nums[i].
Constraints

1 <= nums.length <= 100
-1000 <= nums[i] <= 100
Output Format

For each test case, print the resultant array after moving all the zeros.
Sample Input 0

5
0 1 0 3 12
Sample Output 0

1 3 12 0 0
Explanation 0

Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]

Sample Input 1

1
0
Sample Output 1

0
Explanation 1

Input: nums = [0] Output: [0]*/

//Code
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int [] a =new int[n];
      for(int t=0;t<n;t++)
        a[t]=scn.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]==0 && a[j]!=0)
            swap(a,i,j);
        }
      }
      for(int x:a)
        System.out.print(x+" ");
    }
      static void swap(int a[],int i,int j)
      {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    
}
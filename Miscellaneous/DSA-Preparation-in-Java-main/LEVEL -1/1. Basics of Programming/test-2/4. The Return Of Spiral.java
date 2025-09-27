/*Ques->link->https://www.hackerrank.com/contests/contest-2-go/challenges/the-return-of-spiral
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

Example :

image

NOTE:

These both 2d Array represention is same.

[[1,2,3],[8,9,4],[7,6,5]]       =       1 2 3
                                        8 9 4 
                                        7 6 5
Input Format

Take an input interger n.

Constraints

1 <= n <= 20
Output Format

Print the desired matrix through spiral.

Sample Input 0

3
Sample Output 0

1 2 3
8 9 4
7 6 5
*/

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
     //   int m=scn.nextInt();

        int [][] a=new int[n][n];
int count=1;
int frow=0,fcol=0,lrow=n-1,lcol=n-1;
while(count!=n*n+1)
{
    for(int i=fcol;i<=lcol;i++)
    {
        a[frow][i]=count++;
       // System.out.printf("%d and  %d -",frow,i);
    } if(count==n*n+1)
    break;
    frow++;
    for(int i=frow;i<=lrow;i++)
    {
        a[i][lcol]=count++;
       // System.out.printf("%d and  %d -",i,lcol);

    } if(count==n*n+1)
    break;
    lcol--;
    for(int i=lcol;i>=fcol;i--)
    {
        a[lrow][i]=count++;
       /// System.out.printf("%d and  %d -",lrow,i);

    } if(count==n*n+1)
    break;
    lrow--;
    for(int i=lrow;i>=frow;i--)
    {
        a[i][fcol]=count++;
     //   System.out.printf("%d and  %d -",i,fcol);

    }
    if(count==n*n+1)
        break;
    fcol++;

}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
        System.out.print(a[i][j]+" ");
    System.out.println();
}


    }
}
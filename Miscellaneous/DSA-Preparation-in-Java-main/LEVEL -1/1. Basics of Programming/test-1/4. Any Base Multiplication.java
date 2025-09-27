/*You are given a base b.
You are given two numbers n1 and n2 of base b.
You are required to multiply n1 and n2 and print the value.
Input Format

A base b
A number n1
A number n2
Constraints

2 <= b <= 10
0 <= n1 <= 10000
0 <= n2 <= 10000
Output Format

A number of base b equal in value to n2 * n1.
Sample Input 0

5
1220
31
Sample Output 0

43320*/

//Code
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scn=new Scanner(System.in);
    int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int t,num=0,mul=1;
        while(n2>0)
        {
            t=pro(n1,n2%10,b);
                num=sum(num,t*mul,b);
            mul*=10;
            n2/=10;
        }
        System.out.println(num);
    }
  static int  pro(int n1,int n2, int b)
    {int d1,temp,carry=0,rem=0,quo,num=0,mul=1;
        while(n1!=0||carry!=0)
        {
            d1=n1%10;
            temp=d1*n2+carry;
            rem=temp%b;
            carry=temp/b;
            num=num+(rem*mul);
            mul*=10;
            n1/=10;
        }
     return num;
    }
  static  int sum(int n1,int n2,int b)
    {
        int max;
        max=n1>n2?n1:n2;
        int d1,d2,borrow=0,rem=0,mul=1,temp=0,num=0;
        while(borrow!=0||max!=0)
        {
            d1=n1%10;
            d2=n2%10;
            temp=d1+d2+borrow;
            rem=temp%b;
            borrow=temp/b;
            num=num+(rem*mul);
            mul*=10;
            max/=10;
            n1/=10;
            n2/=10;
        }
        return num;
    }
}

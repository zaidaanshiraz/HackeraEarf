/*Ques->Write a program that receives a number as input and prints it in the following format as shown in the sample case below.

Input Format

A Single line of input, one integers n
Constraints

1 <= n <= 10
Output Format

For each n print a desired pattern
Sample Input 0

3
Sample Output 0

1*2*3*10*11*12
--4*5*8*9
----6*7
Sample Input 1

4
Sample Output 1

1*2*3*4*17*18*19*20
--5*6*7*14*15*16
----8*9*12*13
------10*11*/

//Code
import java.util.Scanner;

public class TOUGH_PATTERN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dec = 2 * n, k = 1;
        int t = n * (n + 1) - (n - 1);
        int a = t;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= dec; j++) {
                if (j % 2 == 0)
                    System.out.print("*");
                else {
                    System.out.print(k);
                    k++;
                }
            }
     dec = dec - 2;
            for (int j = 1; j <= (2 * n - 1) - 2 * i; j++) {
         if (j% 2 == 0)
                   System.out.print("*");
            else {
                      System.out.print(t);
                     t++;                 }
               }
             a = a-((n-1)-i);
                t = a;
                System.out.println();

        }
    }
}
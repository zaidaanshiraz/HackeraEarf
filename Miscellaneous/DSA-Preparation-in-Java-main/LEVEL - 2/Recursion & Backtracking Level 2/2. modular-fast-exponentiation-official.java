//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-interview-prep/number-theory/modular-fast-exponentiation-official/ojquestion

import java.io.IOException;
import java.util.Scanner;

public class Main {
    // public static int mod=1000000009;
	public static int xpown(long x, long n, long p) {
		if(n==0)
		return 1;
		        if(n%2==0)
        {
            int temp=xpown(x,n/2,p);
            return (int)(((temp%p)*(temp%p))%p);
        }
        else
        {
                        int temp=xpown(x,n/2,p);
            return (int)(((((temp%p)*(temp%p))%p)*(x%p))%p);
        }
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
			int x = scn.nextInt();
			int n = scn.nextInt();

            int ans = xpown(x,n,1000000007);
			System.out.println(ans);
		}
}
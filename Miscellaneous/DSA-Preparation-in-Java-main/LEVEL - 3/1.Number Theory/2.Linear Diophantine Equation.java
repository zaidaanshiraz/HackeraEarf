//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-interview-prep/number-theory/linear-diophantine-equation-official/ojquestion

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
        int k = scn.nextInt();
       	Pair ans=euclid(a,b); 
		System.out.println(ans.x*k+" "+ans.y*k);
	}
		public static Pair euclid(long a,long b)
	{
	    if(b==0)
	    {
	        return new Pair(1,0,a);
	    }
	    Pair dash=euclid(b,a%b);
	    return new Pair(dash.y,dash.x-((a/b)*dash.y),dash.gcd);
	}
	public static class Pair{
	    long x;
	    long y;
	    long gcd;
	    public Pair(long x,long y,long gcd)
	    {
	        this.x=x;
	        this.y=y;
	        this.gcd=gcd;
	    }
	}


}
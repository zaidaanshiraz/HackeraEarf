import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int prec=scn.nextInt();
System.out.println(sqroot(n,prec));
  }

   public int mySqrt(int x) {
      long low=1;
        long high=x;
        while(low<=high)
        {
           long mid=low+((high-low)/2);
            if(mid*mid==x)
                return (int)mid;
            if(mid*mid<x)
                low=mid+1;
           else if(mid*mid>x)
                high=mid-1;
            
        }
        // if(low>=nums.length)
        // return nums.length;
        return (int)high;  
    }
public double sqroot(int n,int precision)
{
    double ans=mySqrt(n);
    double j=0.1;
    while(precision-->0)
    {
        while(ans*ans<=n) ans+=j;
        ans=ans-j;
        j=j/10;
    }
    return ans;
}
}
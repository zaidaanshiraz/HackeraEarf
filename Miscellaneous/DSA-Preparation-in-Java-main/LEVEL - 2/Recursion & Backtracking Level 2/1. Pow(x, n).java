//https://leetcode.com/problems/powx-n/

class Solution {
    public static double pow(double x,long n)
    {
        if(n==0) return 1;
        if(n%2==0)
        {
            double temp=pow(x,n/2);
            return temp*temp;
        }
        else
        {
                        double temp=pow(x,n/2);
            return temp*temp*x;
        }
    }
    public double myPow(double x, int n) {
        if(n<0)
        {
            double temp=pow(x,-1l*n);
            
            return 1.0/temp;
        }
        return pow(x,n);
    }
}
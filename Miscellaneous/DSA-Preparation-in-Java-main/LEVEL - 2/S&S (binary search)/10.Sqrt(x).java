///https://leetcode.com/problems/sqrtx/

class Solution {
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
}
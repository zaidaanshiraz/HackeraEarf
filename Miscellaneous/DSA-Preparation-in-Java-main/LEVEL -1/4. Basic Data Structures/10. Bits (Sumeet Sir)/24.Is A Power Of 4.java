//https://leetcode.com/problems/power-of-four/
class Solution {
    public boolean isPowerOfFour(int n) {
        int fac=0b01010101010101010101010101010101;
        if(n>0&&(n&(n-1))==0&&(fac&n)>0)
            return true;
        return false;
    }
}

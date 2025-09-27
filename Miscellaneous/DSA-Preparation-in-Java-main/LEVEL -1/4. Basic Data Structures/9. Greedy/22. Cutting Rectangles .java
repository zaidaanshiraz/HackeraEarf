//https://practice.geeksforgeeks.org/problems/cutting-rectangles3659/1
class Solution{
    public static long gcd(long a,long b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        Long squareSide=gcd(L,B);
        Long noOfSquare=(L*B)/(squareSide*squareSide);
        ArrayList<Long> res=new ArrayList<>();
        res.add(noOfSquare);
        res.add(squareSide);
        return res;
    }
}
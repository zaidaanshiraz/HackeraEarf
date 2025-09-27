//https://www.interviewbit.com/problems/assign-mice-to-holes/#:~:text=A%20mouse%20can%20stay%20at,inside%20a%20hole%20is%20minimized.&text=First%20argument%20is%20an%20integer%20array%20A.
public class Solution {
    public int mice(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int  maxTime=0;
        for(int i=0;i<A.length;i++)
        {
            maxTime=Math.max(maxTime,Math.abs(A[i]-B[i]));
        }
        return maxTime;
    }
}

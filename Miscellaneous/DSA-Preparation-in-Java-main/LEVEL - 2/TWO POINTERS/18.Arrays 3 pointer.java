//https://www.interviewbit.com/problems/array-3-pointers/public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int minimize(final int[] A, final int[] B, final int[] C) {
        int top=0;
        int mid=0;
        int bottom=0;
        int abs=Integer.MAX_VALUE;
        while(top<A.length&&mid<B.length&&bottom<C.length)
        {
         int abs1=Math.abs(A[top]-B[mid]);
         int abs2=Math.abs(B[mid]-C[bottom]);
         int abs3=Math.abs(A[top]-C[bottom]);
         if(Math.max(Math.max(abs1,abs2),abs3)<abs)
         abs=Math.max(Math.max(abs1,abs2),abs3);
         if(A[top]<=B[mid]&&A[top]<=C[bottom])
         top++;
         else if(B[mid]<=A[top]&&B[mid]<=C[bottom])
         mid++;
         else
         bottom++;
        }
        return abs;
    }
}
//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0;
        long maxSum=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            if(i<K)
            {
              sum+=Arr.get(i);  
            }else
            {
                long inc=Arr.get(i);
                long excl=Arr.get(i-K);
                sum=sum+inc-excl;
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
//https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
          HashMap<Long, Long> freq = new HashMap<>();
        long  sum = 0,count=0;
        freq.put(0l, 1l);
        

        for(long val:arr){
            sum+=val;
            count += freq.getOrDefault(sum, 0l);
            freq.put(sum, freq.getOrDefault(sum, 0l) + 1l);
        }
        
        return count;
        
    }
}
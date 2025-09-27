///https://www.interviewbit.com/problems/subarray-with-given-xor/

public class Solution {
    public int solve(int[] arr, int B) {
                  HashMap<Long, Long> freq = new HashMap<>();
        long  pref = 0,count=0;
        freq.put(0l, 1l);
        

        for(long val:arr){
            pref^=val;
            count += freq.getOrDefault(pref^B, 0l);
            freq.put(pref, freq.getOrDefault(pref, 0l) + 1l);
        }
        
        return (int)count;
    }
}

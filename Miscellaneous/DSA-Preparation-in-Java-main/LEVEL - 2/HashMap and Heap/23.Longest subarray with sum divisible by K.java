///https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1

class Solution{
    int longSubarrWthSumDivByK(int nums[], int n, int k)
    {
        // Complete the function
         HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, -1);
        
        // Subarray with Sum Divisible by K => pref[r] % k == pref[l - 1] % k
        int longest = 0, pref = 0;
        for(int i=0;i<nums.length;i++){
            pref = pref + nums[i];
            int remainder = (pref % k + k) % k;
            longest=Math.max(longest,i-freq.getOrDefault(remainder,i));
if(freq.containsKey(remainder)==false)freq.put(remainder,i);
        }
        
        return longest;
       
    }
 
}

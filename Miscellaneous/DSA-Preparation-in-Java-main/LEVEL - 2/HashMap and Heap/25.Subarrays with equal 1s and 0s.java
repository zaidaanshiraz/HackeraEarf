//https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int nums[], int n)
    {
        // add your code here
                HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        
        // Subarray with Sum Divisible by K => pref[r] % k == pref[l - 1] % k
        int zeroes= 0,ones = 0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeroes++;
            else ones++;
            count = count + freq.getOrDefault(zeroes-ones, 0);
            freq.put(zeroes-ones, freq.getOrDefault(zeroes-ones, 0) + 1);
        }
        
        return count;
    }
}

//https://practice.geeksforgeeks.org/problems/maximum-repeating-number4858/1

class Solution {
    int maxRepeating(int[] nums, int n, int k) {
        // code here
           for(int i=0; i<n; i++){
            int val = nums[i] % (n + 1);
            nums[val] += (n + 1);
        }
        
        int maxRepeating= 0, maxFreq = nums[0]/(n+1);
        for(int i=0; i<n; i++){
            if(nums[i] / (n + 1)>maxFreq)
            {
                maxFreq=nums[i]/(n+1);
                maxRepeating=i;
            }
            
        }
        return maxRepeating;
    }
}
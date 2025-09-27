//https://practice.geeksforgeeks.org/problems/equal-0-1-and-23208/1

class Solution 
{ 
    long getSubstringWithEqual012(String nums) 
    { 
        // code here
        HashMap<String,Long>freq=new HashMap<>();
        freq.put("0,0",1l);
        long zeroes=0,ones=0,twos=0,count=0;
        for(int i=0;i<nums.length();i++)
        {
            if(nums.charAt(i)=='0')zeroes++;
            else if(nums.charAt(i)=='1')ones++;
            else twos++;
            String key=(zeroes-ones)+","+(ones-twos);
            count+=freq.getOrDefault(key,0l);
            freq.put(key,freq.getOrDefault(key,0l)+1l);
        }
        return count;
    }
} 
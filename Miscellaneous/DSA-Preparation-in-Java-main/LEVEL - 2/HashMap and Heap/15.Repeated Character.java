//https://practice.geeksforgeeks.org/problems/repeated-character2058/1

class Solution
{
    char firstRep(String s)
    {
        // your code here
                int[] freq = new int[26];
        
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(freq[idx] > 1) return (char)(idx+'a');
        }
        
        return '#';
    }
}
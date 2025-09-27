//Ques->https://leetcode.com/problems/super-ugly-number/

//Code
class Solution {
   class Solution {
    //O(N*K) Time ,O(N+K) Space
    public int nthSuperUglyNumber(int n, int[] primes) {
     int []ptr=new int[primes.length];
        ArrayList<Integer> ugly=new ArrayList<>();
        ugly.add(1);
        //Add 1st ugly No at index 0
        for(int i=1;i<n;i++)
        {
            //Finding the next Smallest Ugly No
            int min=Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++)
                min=Math.min(min,ugly.get(ptr[j])*primes[j]);
            
            ugly.add(min);
        //Updating All Pointers Pointing to Min
            for(int j=0;j<primes.length;j++)
            {
                if(ugly.get(ptr[j])*primes[j]==min)
                    ptr[j]++;
            }
        }
            return ugly.get(n-1);
        
    }
}
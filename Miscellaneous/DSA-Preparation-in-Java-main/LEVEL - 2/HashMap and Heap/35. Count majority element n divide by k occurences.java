//https://practice.geeksforgeeks.org/problems/count-element-occurences/0?page=1&curated%5B%5D=7&sortBy=submissions
class Solution 
{
    public int getFreq(int []nums,int target)
    {
        int count=0;
        for(int val:nums)
        {
            if(val==target)
            count++;
            
        }
        return count;
    }
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int []majority=new int[k-1];
        int []freq=new int[k-1];
        for(int val:arr)
        {
            int idx=0;
            while(idx<k-1&&majority[idx]!=val)
            idx++;
            if(idx<k-1)
            {
                freq[idx]++;
                continue;
            }
            idx=0;
            while(idx<k-1&&freq[idx]>0)idx++;
            if(idx<k-1)
            {
                majority[idx]=val;
                freq[idx]=1;
            }else
            {
                for(int i=0;i<k-1;i++)freq[i]--;
            }
        }
        int count=0;
        for(int val:majority)
        {
            if(getFreq(arr,val)>n/k) count++;
        }
        return  count;
    }
}

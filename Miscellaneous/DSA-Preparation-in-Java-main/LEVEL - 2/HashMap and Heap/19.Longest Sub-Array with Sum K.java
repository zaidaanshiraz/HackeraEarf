//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int K) {
        //Complete the function
               HashMap<Long,Integer>firstOcc=new HashMap<>();
long  sum=0l;
firstOcc.put(sum,-1);
int longest=0;
for(int i=0;i<n;i++)
{
    sum+=arr[i];
    if(firstOcc.containsKey(sum)==false)
    {
        firstOcc.put(sum,i);
    }
    longest=Math.max(longest,i-firstOcc.getOrDefault(sum-K,i));
}
return longest;
    
    }
    }

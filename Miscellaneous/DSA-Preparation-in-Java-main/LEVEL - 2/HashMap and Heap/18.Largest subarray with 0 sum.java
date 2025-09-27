//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
///TLE
class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
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
    longest=Math.max(longest,i-firstOcc.get(sum));
}
return longest;
    }
}
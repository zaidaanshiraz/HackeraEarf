//Ques->https://leetcode.com/problems/k-concatenation-maximum-sum/
class Solution {
    public static int m=1000000007;
    public int add(int a,int b)
    {
        return (a%m+b%m)%m;
    }
    public int mult(int a,int b)
    {
return ((a%m)*(b%m))%m;
    }
    public int kadane(int[] arr) {
       int currSum=0,maxSum=0;
        for(int i=0;i<arr.length;i++)
        {
            currSum=Math.max((currSum+arr[i])%m,arr[i]);
            maxSum=Math.max(maxSum,currSum);
            
        }
        return maxSum;
    }
    public int kConcatenationMaxSum(int []arr,int k)
    {
if(k==1)
    return kadane(arr);
    
    int []twice=new int[arr.length*2];
    int total=0;
    for(int i=0;i<arr.length;i++)
    {
        total=add(total,arr[i]);
        twice[i]=twice[i+arr.length]=arr[i];
        
    }
    int ans=kadane(twice);
    if(total<0)
        return ans;
    long res=(ans+(total*(k-2l)%m)%m);
              return (int)res;
}
}
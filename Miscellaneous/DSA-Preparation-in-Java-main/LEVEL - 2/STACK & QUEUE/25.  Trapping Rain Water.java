//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int []gl=greaterLeft(height);
        int []gr=greaterRight(height);
        int ans=0;
        for(int i=0;i<height.length;i++)
            ans+=(Math.min(gl[i],gr[i])-height[i]);
        return ans;
    }
    public int[] greaterLeft(int []arr)
    {
       int []ans=new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        ans[i]=Math.max(arr[i],ans[i-1]);
        return ans;
        
    }
    public int[] greaterRight(int []arr)
    {
       int []ans=new int[arr.length];
        ans[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        ans[i]=Math.max(arr[i],ans[i+1]);
        return ans;
    }
}
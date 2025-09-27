//https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#

class Solution {
     public int findFirstOcc(int []nums,int target,int high)
    {
            int low=0;
        // int high=nums.length-1;
        while(low<=high)
        {
           int mid=low+((high-low)/2);
            if(nums[mid]>=target)
                high=mid-1;
            else if(nums[mid]<target)
                low=mid+1;
        }
        if(low==-1||low==nums.length||nums[low]!=target)
        return -1;
        return low;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        // int low=0;
        int maxIdx=-1;
        int max=0;
        int high=m-1;
        for(int i=0;i<arr.length;i++)
        {
       int currIdx=findFirstOcc(arr[i],1,high);    
    //   System.out.println("curr->"+currIdx);
            if(currIdx!=-1)
            {
             if(max<arr[0].length-currIdx)
             {
                 maxIdx=i;
                 max=arr[0].length-currIdx;
                 high=currIdx-1;
              }
                }
        }
        return maxIdx;
    }
}
//https://leetcode.com/problems/heaters/

class Solution {
            public int searchInsert(int[] nums, int target) {
 int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
           int mid=low+((high-low)/2);
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                low=mid+1;
           else if(nums[mid]>target)
                high=mid-1;
            
        }
        if(low>=nums.length)
        return nums.length-1;
        return low;
    }
    public int closedOne(int []heaters,int tar)
    {
           int second=searchInsert(heaters,tar);
        // System.out.println()
            int first=second-1;
        if(second>0)
        {
         if(Math.abs(heaters[first]-tar)<=Math.abs(heaters[second]-tar))
             return first;
        }
         return second;
    }
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int minRadius=0;
        for(int i=0;i<houses.length;i++)
        {
            int closest=closedOne(heaters,houses[i]);
minRadius=Math.max(minRadius,Math.abs(heaters[closest]-houses[i]));
        }
        return minRadius;
    }
}
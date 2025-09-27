//https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int water=0;
        int area=0;
        while(left<=right)
        {
        area=(right-left)*Math.min(arr[left],arr[right]);
            water=Math.max(area,water);
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return water;
    }
}
////https://leetcode.com/problems/find-k-closest-elements/

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
        return nums.length;
        return low;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int second=searchInsert(arr,x);
        List<Integer> obj=new ArrayList<>();
        int first=second-1;
        while(first>=0&&second<arr.length&&k-->0)
        {
            if(Math.abs(x-arr[first])<=Math.abs(x-arr[second]))
            {
                obj.add(arr[first]);
                first--;
            }
            else
            { obj.add(arr[second]);
                second++;
            }
        }
        while(first>=0&&k-->0)
        {
            obj.add(arr[first]);
            first--;
        }
                while(second<arr.length&&k-->0)
        {
            obj.add(arr[second]);
            second++;
        }
        Collections.sort(obj);
        return obj;
        
    }
}
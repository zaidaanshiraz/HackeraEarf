//https://leetcode.com/problems/reverse-pairs/

class Solution {
      public  long mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return 0; // 0 or 1 elements in array
        }
        
        int mid = left + (right - left) / 2;
        long leftCount = mergeSort(nums, left, mid); // left Sorted
        long rightCount = mergeSort(nums, mid + 1, right); // right Sorted
        long ans = merge(nums, left, mid, mid + 1, right);
        return (leftCount + rightCount + ans);
    }
    public   int findInversionCount(int []nums,int a1l,int a1r,int a2l,int a2r)
    {
        int invCount=0;
        int ptr1=a1l,ptr2=a2l,ptr3=0;
                while(ptr1 <= a1r && ptr2 <= a2r){   
            if((long)nums[ptr1] <= 2l*(long)nums[ptr2]){
                // res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
               invCount += (a1r - ptr1 + 1l); 
                // res[ptr3] = nums[ptr2];
                ptr3++; ptr2++;
            }
        }
        return invCount;
    }
    
    public  long merge(int[] nums, int a1l, int a1r, int a2l, int a2r){
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        int[] res = new int[totalRes];
        
        long invCount = findInversionCount(nums,a1l,a1r,a2l,a2r);
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if(nums[ptr1] <= nums[ptr2]){
                res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
              //  invCount += (a1r - ptr1 + 1l); 
                res[ptr3] = nums[ptr2];
                ptr3++; ptr2++;
            }
        }
        
        while(ptr1 <= a1r){
           res[ptr3] = nums[ptr1];
           ptr3++; ptr1++; 
        }
        
        while(ptr2 <= a2r){
           res[ptr3] = nums[ptr2];
           ptr3++; ptr2++;  
        }
        
        for(int i=a1l; i<=a2r; i++){
            nums[i] = res[i - a1l];
        }
        
        return invCount;
    }
    public int reversePairs(int[] nums) {
                return (int)mergeSort(nums, 0, nums.length- 1);
    }
}
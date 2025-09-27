//https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1

class Solution {
    public int findCount(int right,int[] nums, int target) {
        // Arrays.sort(nums);
          int left=0;
        int count=0;
        while(left<right)
        {
            if(nums[left]+nums[right]==target)
            {
                left++;
                right--;
                count++;

            }
            else if(nums[left]+nums[right]<target)
                left++;
            else
                right--;
        }
    return count;   
    }
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count=0;
for(int i=arr.length-1;i>=2;i--)
{
    count+=findCount(i-1,arr,arr[i]);
}
return count;
    }
}
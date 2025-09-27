//https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
                int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
           int mid=low+((high-low)/2);
            if(arr[mid]==1)
            {
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]==0)
                low=mid+1;
        }
        return ans;
    }
}
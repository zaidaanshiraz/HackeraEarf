//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
          int currentRooms=0,maxRooms=0;
        int startIdx=0,endIdx=0;
        while(startIdx<arr.length)
        {
            if(arr[startIdx]<=dep[endIdx])
            {
                startIdx++;
                currentRooms++;
            }else if(dep[endIdx]<dep[startIdx])
            {
                endIdx++;
                currentRooms--;
            }
            else
            {
                startIdx++;
                endIdx++;
            }
            maxRooms=Math.max(maxRooms,currentRooms);
        }
        return maxRooms;
    }
    
}
//https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1/

class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        PriorityQueue<Integer> q=new PriorityQueue<>();
        ArrayList<Integer> obj=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            q.add(arr[i]);
            if(i>k)
            {
                obj.add(q.remove());
            }
       
        }
             while(q.size()>0)
        {
            obj.add(q.remove());
        }
        return obj;
    }
}
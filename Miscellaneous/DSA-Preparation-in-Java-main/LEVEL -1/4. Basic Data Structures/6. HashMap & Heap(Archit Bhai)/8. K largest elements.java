//https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i<k)
            pq.add(arr[i]);
            else
            {
                if(arr[i]>pq.peek())
                {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> obj=new ArrayList<>();
        while(pq.size()>0)
        {
            int val=pq.remove();
            obj.add(val);
        }
         Collections.reverse(obj);
        return obj;
        
    }
}
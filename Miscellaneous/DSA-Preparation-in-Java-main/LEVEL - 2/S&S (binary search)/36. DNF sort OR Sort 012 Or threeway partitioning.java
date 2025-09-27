//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution
{
    public static void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort012(int arr[], int n)
    {
        // code here 
        int i=0,j=0,k=arr.length-1;
        while(j<=k)
        {
            if(arr[j]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
                
            }else if(arr[j]==2)
            {
                         swap(arr,j,k);
                k--;
            }else j++;
        }
    }
}
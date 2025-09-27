///https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1
public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int window=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            window++;
        }
        int currMin=0;
        int swaps=window;
        for(int i=0;i<n;i++)
        {
            if(i<window)
            {
                if(arr[i]<=k)
                currMin++;
            }else 
            {
                if(arr[i-window]<=k)
                currMin--;
                if(arr[i]<=k)
                currMin++;
            }
            swaps=Math.min(swaps,window-currMin);
        }
        return swaps;
    }
    
    
}

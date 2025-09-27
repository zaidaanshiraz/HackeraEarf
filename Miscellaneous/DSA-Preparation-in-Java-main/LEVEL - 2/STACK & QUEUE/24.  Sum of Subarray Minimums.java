//https://leetcode.com/problems/sum-of-subarray-minimums/

class Solution {
    public int sumSubarrayMins(int[] arr) {
        long []nsr=nsr(arr);
        long []nsl=nsl(arr);
        long res=0;
        for(int i=0;i<arr.length;i++)
        {
            res+=(arr[i]*(nsr[i]-i)*(i-nsl[i]));
        }
        return (int)(res%1000000007l);
    }
      public static long []nsr(int []arr)
  {
     long []nse=new long[arr.length];
     Arrays.fill(nse,arr.length);
     Stack<Integer>stk=new Stack<>();
     for(int i=arr.length-1;i>=0;i--)
     {
        while(stk.size()>0 && arr[i]<=arr[stk.peek()])
        {
           stk.pop();
        }
        if(stk.size()>0)
        nse[i]=stk.peek();
        stk.push(i);
        
     }return nse;
  }

  public static long []nsl(int []arr)
  {
     long []nse=new long[arr.length];
     Arrays.fill(nse,-1);
     Stack<Integer>stk=new Stack<>();
     for(int i=0;i<arr.length;i++)
     {
        while(stk.size()>0 && arr[i]<arr[stk.peek()])
        {
           stk.pop();
        }
        if(stk.size()>0)
        nse[i]=stk.peek();
        stk.push(i);
        
     }
     return nse;
  }

}
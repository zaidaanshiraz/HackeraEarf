//https://leetcode.com/problems/sliding-window-maximum/

class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> q=new ArrayDeque<>();
        int []res=new int[arr.length-k+1];
        int idx=0;
        for(int i=0;i<k;i++)
        {
            while(q.size()>0&&q.getLast()<arr[i])
                q.removeLast();
            q.addLast(arr[i]);
        }
        res[idx++]=(q.size()>0)?q.getFirst():0;
        System.out.println(q);
        for(int i=k;i<arr.length;i++)
        {
            if(q.size()>0&&arr[i-k]==q.getFirst())
                q.removeFirst();
            while(q.size()>0&&q.getLast()<arr[i])
                q.removeLast();
            q.addLast(arr[i]);
                    res[idx++]=(q.size()>0)?q.getFirst():0;
        }
     return res;   
    }
}
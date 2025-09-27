//https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[]res=new long[N-K+1];
    Queue<Long> q=new ArrayDeque<>();
    int idx=0;
    for(int i=0;i<K;i++)
    {
        if(A[i]<0)
        q.add(A[i]);
    }

    res[idx++]=(q.size()>0)?q.peek():0;
    for(int i=K;i<N;i++)
    {
        if(q.size()>0&&A[i-K]==q.peek())
        q.remove();
        if(A[i]<0)
        q.add(A[i]);
          res[idx++]=(q.size()>0)?q.peek():0;  
    }
    return res;
    }
}
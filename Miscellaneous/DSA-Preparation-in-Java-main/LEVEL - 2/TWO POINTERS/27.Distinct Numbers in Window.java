//https://www.interviewbit.com/problems/distinct-numbers-in-window
public class Solution {
    public int[] dNums(int[] A, int B) {
        int N=A.length;
        int[]res=new int[N-B+1];
        if(B>N) return res;
        int idx=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(i<B-1)
            {
                int freq=hm.getOrDefault(A[i],0);
            hm.put(A[i],freq+1);
            }
            else if(i==B-1)
            {
                 int freq=hm.getOrDefault(A[i],0);
            hm.put(A[i],freq+1);
                    res[idx++]=hm.size();
            }else 
            {
                int excl=A[i-B];
                int freq=hm.get(excl);
                hm.put(excl,freq-1);
                if(hm.get(excl)==0)
                hm.remove(excl);
                 freq=hm.getOrDefault(A[i],0);
            hm.put(A[i],freq+1);
                res[idx++]=hm.size();
            }
        }
        return res;
    }
}

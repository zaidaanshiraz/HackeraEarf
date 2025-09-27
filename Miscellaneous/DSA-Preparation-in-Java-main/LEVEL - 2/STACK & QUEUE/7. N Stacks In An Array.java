//https://www.codingninjas.com/codestudio/problems/n-stacks-in-an-array_1164271?leftPanelTab=0

public class NStack {
    int []arr;
    int []next;
    int []top;
    int freeIdx;

    public NStack(int K, int N) {

        arr=new int[N];
        next=new int[N];
        for(int i=0;i<N;i++)
        {
            next[i]=i+1;
        }
        next[N-1]=-1;
        top=new int[K];
        for(int i=0;i<K;i++)
        {
            top[i]=-1;
        }
        freeIdx=0;
    }


    public boolean push(int x, int m) {
        // Write your code here.
        if(freeIdx==-1)
            return false;
        int currIdx=freeIdx;
       //fill element in array
        arr[currIdx]=x;
        //Update freeIdx to next FreeIdx
        freeIdx=next[freeIdx];
        //Update next to previous element index of mth stack
        next[currIdx]=top[m-1];
       //Make current element index as top of mth stack
        top[m-1]=currIdx;
        return true;
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        // Write your code here.
        if(top[m-1]==-1)
            return -1;
        
        int currIdx=top[m-1];
        
        //Update Top of mth stack as Previous Element's Index
        
        top[m-1]=next[currIdx];
        
        //Update next of currIdx as next Free Slot
        next[currIdx]=freeIdx;
        ///Make current Index as Free InDex
         freeIdx=currIdx;
        return arr[currIdx];
        
    }
}
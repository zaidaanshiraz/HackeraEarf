//Ques->https://nados.io/question/sliding-window-maximum

//Code
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res=new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
            //remove first element when first element is eexcluded
            if(q.size()>0 &&q.getFirst()<=i-k)
            {
                q.removeFirst();
            }
            //remove last -> smaller than our curr element 
            while(q.size()>0 &&nums[q.getLast()]<nums[i])
            {
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1)
            {
                res[idx++]=nums[q.getFirst()];
            }
            
        }
        return res;
    }
}
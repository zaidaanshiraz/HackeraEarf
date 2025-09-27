//https://leetcode.com/problems/find-median-from-data-stream/
class MedianFinder {
public static double median=-1;
public static     PriorityQueue<Integer> minHeap ;
public static     PriorityQueue<Integer> maxHeap ;
    public MedianFinder() {
    minHeap    =new PriorityQueue<>();
    maxHeap     =new PriorityQueue<>(Collections.reverseOrder());
     }
    public static void balance()
    {
        if(Math.abs(minHeap.size()-maxHeap.size())>1)
        {
            if(minHeap.size()>maxHeap.size())
            {
                int val=minHeap.remove();
                maxHeap.add(val);
            }
            else
            {
                int val=maxHeap.remove();
                minHeap.add(val);
            }
        }
    }
    
    public void addNum(int num) {
        if(median==-1)
        {
         maxHeap.add(num);   
        }
        else
        {
            median=findMedian();
            if(num<=median)
                maxHeap.add(num);
            else
                minHeap.add(num);
        }
        balance();
    }
    
    public double findMedian() {
        // System.out.println(maxHeap+"&"+minHeap);
        if((minHeap.size()+maxHeap.size())%2==0)
        {
        int left=(maxHeap.size()>0)?maxHeap.peek():0;
        int right=(minHeap.size()>0)? minHeap.peek():0;
            // System.out.println(left+"---"+right);
        median=(double)(left+right)/2;
            return median;
        }
        if(minHeap.size()>maxHeap.size())
            return minHeap.peek();
        return maxHeap.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
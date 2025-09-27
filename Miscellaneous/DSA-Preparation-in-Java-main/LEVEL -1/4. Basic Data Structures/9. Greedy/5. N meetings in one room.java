//https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static class Interval
    {
        int start;
        int end;
        Interval(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    public static class MyComparator implements Comparator<Interval>{
        public int compare(Interval obj1,Interval obj2)
        {
            if(obj1.end!=obj2.end)
            return obj1.end-obj2.end;
            return obj1.start-obj2.start;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Interval []intervals=new Interval[n];
        for(int i=0;i<n;i++)
        {
            intervals[i]=new Interval(start[i],end[i]);
        }
        Arrays.sort(intervals,new MyComparator());
        // Collections.sort(intervals,new MyComparator());
        int limit=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(limit<intervals[i].start)
           { count++;
            limit=intervals[i].end;}
        }
        return count;
    }
    
}
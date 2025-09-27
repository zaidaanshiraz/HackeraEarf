//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

class Solution {
        public static class Pair implements Comparable<Pair>{
        int start,end;
        Pair (int start,int end)
        {
this.start=start;
            this.end=end;
            
        }
        public int compareTo(Pair other)
        {
            if(this.end<other.end) return -1;
            else return 1;
        }
    }
    public int findMinArrowShots(int[][] nums) {
           int n=nums.length;
    Pair []intervals=new Pair[n];
        for(int i=0;i<n;i++)
        {
            intervals[i]=new Pair(nums[i][0],nums[i][1]);
        }
        Arrays.sort(intervals);
        int ans=1,limit=intervals[0].end;
        for(int i=1;i<n;i++)
        {
            if(intervals[i].start>limit)
            {
                ans++;
                limit=Math.max(limit,intervals[i].end);
            }
        }
        return ans;  
    }
}
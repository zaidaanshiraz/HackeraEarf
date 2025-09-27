//https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
class Solution
{
    public static class MyComparator implements Comparator<Job>{
        public  int compare (Job obj1,Job obj2)
        {
            if(obj1.profit!=obj2.profit){
            return obj2.profit-obj1.profit;
            }
             return obj2.deadline-obj1.deadline;
        }
       
    }
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,new MyComparator());
        int maxDeadline=0;
        for(int i=0;i<n;i++)
        {
            maxDeadline=Math.max(arr[i].deadline,maxDeadline);
        }
        boolean []slots=new boolean[maxDeadline];
        int maxProfit=0;
        int jobsAllocated=0;
        for(int i=0;i<n;i++)
        {
            for(int j=arr[i].deadline-1;j>=0;j--)
            {
                if(slots[j]==false)
                {
                    slots[j]=true;
                    jobsAllocated++;
                    maxProfit+=arr[i].profit;
                    break;
                }
            }
        }
        return new int[]{jobsAllocated,maxProfit};
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
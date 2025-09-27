//Ques->https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1/

//Code
class Solution{
    static List<Integer> minPartition(int target)
    {
        // code here
        int []coins={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int count=0;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--)
        {
            while(target-coins[i]>=0)
            {
                res.add(coins[i]);
                target-=coins[i];
            }
            if(target==0)
            break;
        }
        return res;
        
    }
}
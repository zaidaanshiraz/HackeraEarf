//https://www.lintcode.com/problem/607/
public class TwoSum {
    /**
     * @param number: An integer
     * @return: nothing
     */
     ArrayList<Integer>data;
        boolean isSorted;
    public TwoSum()
    {
        data=new ArrayList<>();
        isSorted=true;
    }
    public void add(int number) {
        // write your code here
        data.add(number);
        isSorted=false;
    }

    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
        if(isSorted==false)
        {
            Collections.sort(data);
            isSorted=true;
        }
        int left=0,right=data.size()-1;
        while(left<right)
        {
            int sum=data.get(left)+data.get(right);
            if(sum==value) return true;
            else if(sum<value) left++;
            else
            right--;
        }
        return false;
    }
}
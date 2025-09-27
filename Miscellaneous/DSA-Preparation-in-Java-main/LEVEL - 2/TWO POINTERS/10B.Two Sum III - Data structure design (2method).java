//https://www.lintcode.com/problem/607/
public class TwoSum {
    /**
     * @param number: An integer
     * @return: nothing
     */
     HashMap<Integer,Integer> freq;
     public TwoSum(){
         freq=new HashMap<>();
     }
    public void add(int number) {
        // write your code here
freq.put(number,freq.getOrDefault(number,0)+1);
    }

    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
                for(Integer key:freq.keySet())
        {
            int comp=value-key;
            int freq_comp=freq.getOrDefault(comp,0);
          if(comp==key)
          {
              if(freq_comp>=2) return true;
          }
          else
          {
              if(freq_comp>=1) return true;
          }
        }
        return false;
    }
}
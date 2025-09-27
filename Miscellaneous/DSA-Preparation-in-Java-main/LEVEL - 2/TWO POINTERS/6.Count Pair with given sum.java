//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

class Solution {
    public:
        int getPairsCount(int arr[], int n, int k) {
           HashMap<Integer,Integer> hm=new HashMap<>();
           int count=0;
           for(int i=0;i<arr.length;i++)
           {
        int comp=k-arr[i];
        int freq=hm.getOrDefault(comp,0);
        count+=freq;
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
           }
return count;
        }
};
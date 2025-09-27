//https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int a:nums1)
            hm.put(a,true);
        ArrayList<Integer> obj=new ArrayList<>();
        for(int b:nums2)
        {
            if(hm.containsKey(b)==true &&hm.get(b)==true)
            { obj.add(b);
             hm.put(b,false);
            }
        }
        int []arr=new int[obj.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=obj.get(i);
        return arr;
    }
}
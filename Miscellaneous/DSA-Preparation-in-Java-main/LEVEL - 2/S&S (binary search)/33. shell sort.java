//https://leetcode.com/problems/merge-sorted-array/

class Solution {
      public void swap(int []nums1,int a ,int b)
    {
        int temp=nums1[a];
        nums1[a]=nums1[b];
        nums1[b]=temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++)
            nums1[i]=nums2[i-m];
for(double gap=(m+n)/2.0;gap>0;gap=gap/2.0)
{
    int jStart=(int)Math.ceil(gap);
    for(int i=0,j=jStart;j<m+n;i++,j++)
    {
        if(nums1[i]>nums1[j])
        {
            swap(nums1,i,j);
        }
    }
    if(jStart==1) break;
}
    }
}
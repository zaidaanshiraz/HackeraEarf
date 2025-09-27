//https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(int []a,int []b)->{
            return (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]);
        });
        int [][]ans=new int[k][2];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<2;j++)
                ans[i][j]=points[i][j];
        }
        return ans;
    }
}
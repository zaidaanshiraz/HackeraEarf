//https://leetcode.com/problems/trapping-rain-water-ii/

class Solution {
    public static class Pair implements Comparable<Pair>{
        int val;
        int r;
        int c;
        Pair(int val,int r,int c)
        {
this.val=val;
            this.r=r;
            this.c=c;
        }
        public int compareTo(Pair other)
        {
            return this.val-other.val;
        }
    }
    int []rows={0,-1,0,1};
    int []cols={-1,0,1,0};
    public int trapRainWater(int[][] mat) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int row=mat.length;
        int col=mat[0].length;
        for(int j=0;j<col;j++)
        {
           pq.add(new Pair(mat[0][j],0,j));
            mat[0][j]=-1;
            pq.add(new Pair(mat[row-1][j],row-1,j));
            mat[row-1][j]=-1;
        }
        for(int i=1;i<row-1;i++)
        {
            pq.add(new Pair(mat[i][0],i,0));
            mat[i][0]=-1;
            pq.add(new Pair(mat[i][col-1],i,col-1));
            mat[i][col-1]=-1;
        }
        int water=0;
        while(pq.size()>0)
        {
        Pair min=pq.remove();
            for(int i=0;i<4;i++)
            {
          int r=min.r+rows[i];
                int c=min.c+cols[i];
                if(r>=0&&r<row&&c>=0&&c<col&&mat[r][c]!=-1)
                {
int newVal=mat[r][c];
                    if(newVal<min.val)
                    {
                        water+=min.val-newVal;
                        pq.add(new Pair(min.val,r,c));
                    }else
                        pq.add(new Pair(mat[r][c],r,c));
                    mat[r][c]=-1;
                    
                    
                }
            }
        }
        return water;
        // return water;
    }
}
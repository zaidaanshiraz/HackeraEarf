// /https://practice.geeksforgeeks.org/problems/ncr1019/1/

class Solution{
    static int nCr(int rows, int cols)
    {
        if(cols > rows) return 0;
        if(rows == 0 || rows == cols || cols == 0) return 1;
        
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        
        for(int n=1; n<=rows; n++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1); // nC0
            
            for(int k=1; k<n; k++){
                // nCk = n-1Ck-1 + n-1Ck
                int nCk = (prev.get(k) + prev.get(k - 1)) % 1000000007;;
                curr.add(nCk);
            }
            
            curr.add(1); // nCn
            prev = curr;
        }
        
        return prev.get(cols);
    }
}
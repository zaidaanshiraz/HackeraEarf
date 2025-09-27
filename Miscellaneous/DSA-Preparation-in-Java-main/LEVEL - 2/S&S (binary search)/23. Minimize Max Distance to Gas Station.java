//https://www.lintcode.com/problem/848/

public class Solution {
    /**
     * @param stations: an integer array
     * @param k: an integer
     * @return: the smallest possible value of D
     */
    
    public boolean possible(double x, int []stations, int K) 
    {
        int count = 0;
        for (int i = 1; i < stations.length; i++) 
            count += (int) ((stations[i] - stations[i - 1]) / x);
        return count <= K;
    }
    public double minmaxGasDist(int[] stations, int k) {
        // Writ
          double low = 0, high = 1e8;
        while (high - low > 1e-6) 
        {
            double mid = (low + high) / 2.0;
            if (possible(mid, stations, k)) high = mid;
            else low = mid;
        }
        return low;
    }
    }
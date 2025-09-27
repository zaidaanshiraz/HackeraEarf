///https://practice.geeksforgeeks.org/problems/largest-number-in-k-swaps-1587115620/1#


class Solution
{
    //Function to find the largest number after k swaps.
    static String max;
//   static double mod=1000000007;
	
	public static String swap(String str, int i, int j){
	    String res = "";
	    for(int k=0; k<str.length(); k++){
	        if(k == i)
	            res = res + str.charAt(j);
	        else if(k == j)
	            res = res + str.charAt(i);
	        else res = res + str.charAt(k);
	    }
	    return res;
	}
	/////Doubt
	public static void findMaximum(String str, int k) {
	   if(Double.parseDouble(str) >= Double.parseDouble(max)) { /////Doubt
	       max = str;
	   }
	   
	   if(k == 0) return;
	   
	   for(int i=0; i<str.length() - 1; i++){
	       for(int j = i + 1; j < str.length(); j++){
	           if(str.charAt(i) < str.charAt(j)){
	               str = swap(str, i, j);
	               findMaximum(str, k - 1);
	               str = swap(str, i, j);
	           }
	       }
	   }
	}
	
    public static String findMaximumNum(String str, int k)
        {
            //code here.
            	max = str;
		findMaximum(str, k);
		return max;
        }
}
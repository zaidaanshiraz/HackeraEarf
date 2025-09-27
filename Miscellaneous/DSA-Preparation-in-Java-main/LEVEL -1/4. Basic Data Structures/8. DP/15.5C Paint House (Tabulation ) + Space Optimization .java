//Ques->https://www.lintcode.com/problem/515/description

//Code
public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] arr) {
        // write your code here]
        if(arr.length==0)
        return 0;
        int red=arr[0][0];
int green=arr[0][1];
int blue=arr[0][2];
for(int i=1;i<arr.length;i++)
{
    int nred=Math.min(green,blue)+arr[i][0];
    int ngreen=Math.min(red,blue)+arr[i][1];
    int nblue=Math.min(green,red)+arr[i][2];
    red=nred;
    green=ngreen;
    blue=nblue;
}
return Math.min(red,Math.min(green,blue));

    }
}
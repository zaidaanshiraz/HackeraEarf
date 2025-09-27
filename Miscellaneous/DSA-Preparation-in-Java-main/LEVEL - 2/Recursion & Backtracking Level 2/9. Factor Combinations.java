//https://www.codingninjas.com/codestudio/problems/factor-combinations_1232628?leftPanelTab=0
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Integer>> factorCombinations(int n) {
		// Write your code here.

        ArrayList<ArrayList<Integer>> Combinations=new ArrayList<>();
        ArrayList<Integer> combination=new ArrayList<>();
        findAns(Combinations,combination,2,n,n);
        return Combinations;
	}
            public static void findAns(ArrayList<ArrayList<Integer>> Combinations,  ArrayList<Integer> combination,int start ,int n,int N)
        {
//                 System.out.println(n);
if(n==1)
{
//     System.out.println(combination);
ArrayList<Integer> temp=new ArrayList<>(combination);
    Combinations.add(temp);
    return ;
}
        for(int i=start;i<=n;i++)
        {
if(n%i==0&&i!=N)
{
    combination.add(i);
  findAns(Combinations,combination,i,(n/i),N);
    combination.remove(combination.size()-1);
}
        }
        
        
        }
}
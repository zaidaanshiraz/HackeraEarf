//https://www.codingninjas.com/codestudio/problems/two-cliques_1214524

import java.util.*;

public class Solution {
        public static boolean DFS(int curr,int level,int []visited,boolean [][]graph)
    {
        if(visited[curr]!=-1)
        {
            if(visited[curr]==level%2) return true;
            return false;
        }
        visited[curr]=level%2;
        for(int nbr=0;nbr<graph[curr].length;nbr++)
        {
            if(curr!=nbr&&graph[curr][nbr]==false)
                if(DFS(nbr,level+1,visited,graph)==false)
                return false;
        }
        return true;
    }
    public static boolean twoCliques(int n, ArrayList<ArrayList<Integer>> edgeList) {
        // Write your code here
                int []visited=new int[n];
        Arrays.fill(visited,-1);
        boolean [][]adj=new boolean[n][n];
        for(int i=0;i<edgeList.size();i++)
        {
            adj[edgeList.get(i).get(0)][edgeList.get(i).get(1)]=true;
              adj[edgeList.get(i).get(1)][edgeList.get(i).get(0)]=true;
        }
        for(int i=0;i<n;i++)
        {
            if(visited[i]==-1&&DFS(i,0,visited,adj)==false)
                return false;
        }
        return true;
    }
}
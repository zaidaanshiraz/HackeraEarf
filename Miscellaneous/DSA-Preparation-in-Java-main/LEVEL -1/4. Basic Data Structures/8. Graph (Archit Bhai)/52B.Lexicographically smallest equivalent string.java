//https://www.codingninjas.com/codestudio/problems/smallest-equivalent-string_1381859?leftPanelTab=0

import java.util.*;
public class Solution {
    static class DSU{
        int []parent;
        DSU(int n)
        {
            parent=new int[n];
            Arrays.fill(parent,-1);
        }
        public void union(int a,int b)
        {
            int pa=find(a);
            int pb=find(b);
            if(pa==pb) return ;
            if(pa<pb)
                parent[pb]=pa;
            else
                parent[pa]=pb;
        }
        public int find(int a)
        {
           if(parent[a]==-1)return a;
            return parent[a]=find(parent[a]);
        }
    }
	public static String smallestString(String s, String t, String str) {
		// Write your code here
        DSU sets=new DSU(27);
        for(int i=0;i<s.length();i++)
        {
       int a=s.charAt(i)-'a';
            int b=t.charAt(i)-'a';
           sets.union(a,b);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            int find=str.charAt(i)-'a';
            char ch=(char)(sets.find(find)+'a');
            ans.append(ch);
        }
        return ans.toString();
	}
}


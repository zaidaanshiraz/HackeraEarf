//https://leetcode.com/problems/longest-common-prefix/

class Solution {
       public static class Node{
        private Node[]children=new Node[26];
    private boolean isEnd=false;
    private int prefixCount=0;
    private int isEndVal=0;
    public boolean contains(char ch)
    {
        return (children[ch-'a']!=null);
    }
    public Node get(char ch)
    {
        return children[ch-'a'];
    }
    public void set(char ch)
    {
        children[ch-'a']=new Node();
    }
    public boolean getEnd()
    {
        return isEnd;
    }
    public void setEnd()
    {
        isEnd=true;
    }
    public int getFreq(){
        return isEndVal;
    }
    public int getPref(){
        return prefixCount;
    }
    public void increaseFreq(){
        isEndVal++;
    }
    public void decreaseFreq(){
        isEndVal--;
    }
    public void increasePref()
    {
        prefixCount++;
    }
    public void decreasePref(){
        prefixCount--;
    }
}
            Node root;
        public void insert(String word) {
        // Write your code here.
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            curr.increasePref();
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
                curr.set(ch);
            curr=curr.get(ch);
        }
        curr.increasePref();
        curr.increaseFreq();
        
    }
     
    public String DFS(Node curr,String asf,int n)
    {
    
        for(char ch='a';ch<='z';ch++)
        {
            if(curr.contains(ch)==true&&curr.getPref()==n)
            {
Node child=curr.get(ch);
    if(child.getPref()!=n)
        return asf;
        asf=DFS(child,asf+ch,n);
            }
        }
        return asf;
    }
    public String longestCommonPrefix(String[] strs) {
 root=new Node();
        for(String str:strs)
            insert(str);
   return DFS(root,"",strs.length);
         
    }
}
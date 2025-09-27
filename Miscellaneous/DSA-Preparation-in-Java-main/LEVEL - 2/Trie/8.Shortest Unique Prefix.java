//https://www.interviewbit.com/problems/shortest-unique-prefix/

public class Solution {
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
       public String DFS(String word,String asf)
    {
        Node curr=root;
     for(int i=0;i<word.length()-1;i++)
     {
         char ch=word.charAt(i);
         if(curr.contains(ch)==true&&curr.prefixCount>1)
         {
             Node child=curr.get(ch);
             char nch=word.charAt(i+1);
             if(child.contains(nch)==true&&child.prefixCount==1)
             return word.substring(0,i+1);
             curr=curr.get(ch);
         }
     }
     return word;
    }
    public String[] prefix(String[] A) {
        root=new Node();
    for(int i=0;i<A.length;i++)
    insert(A[i]);
  String[]res=new String[A.length];
  for(int i=0;i<A.length;i++)
  res[i]=DFS(A[i],"");
  return res;
    }
}

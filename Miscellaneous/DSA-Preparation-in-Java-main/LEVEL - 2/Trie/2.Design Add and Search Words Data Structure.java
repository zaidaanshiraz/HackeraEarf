//https://leetcode.com/problems/design-add-and-search-words-data-structure/

class WordDictionary {
public static class Node{
    private Node[]children=new Node[26];
    private boolean isEnd=false;
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
}
    Node root;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
                curr.set(ch);
            curr=curr.get(ch);
        }
        curr.setEnd();
    }
    
    public boolean helper(int idx,String word,Node curr)
    {
        if(idx==word.length())
            return curr.getEnd();
        char ch=word.charAt(idx);
        if(ch!='.')
        {
            if(curr.contains(ch)==false) return false;
               return helper(idx+1,word,curr.get(ch));
                   
        }else
        {
            for(char chn='a';chn<='z';chn++)
            {
                if(curr.contains(chn)==false) continue;
               // curr=curr.get(chn);
               if(helper(idx+1,word,curr.get(chn))==true)
                   return true;
            }
           
        }
         return false;
    }
    public boolean search(String word) {
        Node curr=root;
  return helper(0,word,curr);
}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
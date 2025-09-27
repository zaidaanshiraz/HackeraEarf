//https://leetcode.com/problems/prefix-and-suffix-search/

class WordFilter {
public static class Node{
    private Node[]children=new Node[27];
    private boolean isEnd=false;
    private int idx=-1;
    public boolean contains(char ch)
    {
        if(ch=='#') return (children[26]!=null);
        return (children[ch-'a']!=null);
    }
    public Node get(char ch)
    {
        if(ch=='#') return children[26];
        return  children[ch-'a'];
    }
    public void set(char ch)
    {
        if(ch=='#') children[26]=new Node();
        else
        children[ch-'a']=new Node();
    }
    public boolean getEnd()
    {
        return isEnd;
    }
    public void setEnd(){
        isEnd=true;
    }
}
    Node root;
     public void insert(Node curr,String word,int idx) {
 curr.idx=idx;
         // System.out.println(word);
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
                curr.set(ch);
            curr=curr.get(ch);
                     curr.idx=idx;
        }
        curr.setEnd();
         curr.idx=idx;
    }
    public WordFilter(String[] words) {
        root=new Node();
        for(int idx=0;idx<words.length;idx++)
        {
            String word=words[idx];
            for(int i=0;i<word.length();i++)
            {
                insert(root,word.substring(i)+'#'+word,idx);
            }
            insert(root,'#'+word,idx);
        }
    }
    public int search(Node curr,String word)
    {

           for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            if(curr.contains(ch) == false)
                return -1;
        
            curr = curr.get(ch);
        }
        
        return curr.idx;
    }
    public int f(String pref, String suff) {
        
        return search(root,suff+'#'+pref);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */
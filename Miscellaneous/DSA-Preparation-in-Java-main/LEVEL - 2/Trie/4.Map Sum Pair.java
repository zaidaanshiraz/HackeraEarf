//https://leetcode.com/problems/map-sum-pairs/

class MapSum {
public static class Node{
    private Node[]children=new Node[26];
    private boolean isEnd=false;
    private int val=0;
    public int pref=0;
    public boolean contains(char ch)
    {
        return (children[ch-'a']!=null);
    }
    public int getVal(){
        return val;
    }
    public Node get(char ch)
    {
        return children[ch-'a'];
    }
    public void set(char ch)
    {
        children[ch-'a']=new Node();
    }
    public void setVal(int val)
    {
        this.val=val;
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
    public MapSum() {
       root=new Node(); 
    }
    public int search(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
                return 0;
            curr=curr.get(ch);
        }
        return curr.getVal();
    }
    public void insert(String key, int val) {
        int oldval=search(key);
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            curr.pref+=(val-oldval);
            char ch=key.charAt(i);
            if(curr.contains(ch)==false)
                curr.set(ch);
            curr=curr.get(ch);
        }
        curr.pref+=(val-oldval);
        curr.setVal(val);
    }
    
    public int sum(String prefix) {
        Node curr=root;
               for(int i=0;i<prefix.length();i++)
        {
            char ch=prefix.charAt(i);
                   if(curr.contains(ch)==false)
                return 0;
            curr=curr.get(ch);
        } 
        return curr.pref;
    }
}
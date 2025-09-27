//https://www.codingninjas.com/codestudio/problems/implement-trie_1387095?leftPanelTab=0

public class Trie {
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
    public Trie() {
        // Write your code here.
        root=new Node();
    }

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

    public int countWordsEqualTo(String word) {
        // Write your code here.
                Node curr=root;
        for(int i=0;i<word.length();i++)
        {
           // curr.increasePref();
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
return 0;
            curr=curr.get(ch);
        }
        return curr.getFreq();
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
              Node curr=root;
        for(int i=0;i<word.length();i++)
        {
           // curr.increasePref();
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
return 0;
            curr=curr.get(ch);
        }
        return curr.getPref();
    }

    public void erase(String word) {
        // Write your code here.
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            curr.decreasePref();
            char ch=word.charAt(i);
            curr=curr.get(ch);
        }
        curr.decreasePref();
        curr.decreaseFreq();
  
    }

}

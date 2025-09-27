
//https://leetcode.com/problems/search-suggestions-system/
//code correct but not working properly
//leetcode 1268
class Solution {
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
    public void setEnd(){
        isEnd=true;
    }
}
    Node root;
        public void insert(String word) {
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
    public void findList(Node curr,List<String> obj,String asf)
    {
        if(obj.size()==3)
            return ;
        if(curr.getEnd()==true)
            obj.add(asf);
        for(char ch='a';ch<='z';ch++)
        {
            if(curr.contains(ch)==true)
            {
                findList(curr.get(ch),obj,asf+ch);
            }
        }
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        root=new Node();
      for(String word:products)
          insert(word);
        List<List<String>> ans=new ArrayList<>();
        Node curr=root;
        for(int i=0;i<searchWord.length();i++)
        {
            List<String> subans=new ArrayList<>();
            char ch=searchWord.charAt(i);
            if(curr.contains(ch)==true)
            {
                curr=curr.get(ch);
                findList(curr,subans,searchWord.substring(0,i+1));
              ans.add(subans);
                
            }else break;
            
        }
        while (ans.size() < searchWord.length()) {
            ans.add(new ArrayList<>());
        }
        return ans;
    }
}
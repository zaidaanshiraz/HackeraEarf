//https://leetcode.com/problems/word-search-ii/
class Solution {
         public static class Node {
        private Node[] children = new Node[26];
        private boolean isTerminal = false;

        public Node get(char ch) {
            return children[ch - 'a'];
        }

        public boolean isTerminal() {
            return isTerminal;
        }

        public void setTerminal() {
            isTerminal = true;
        }

        public void add(char ch) {
            children[ch - 'a'] = new Node();
        }

        public boolean contains(char ch) {
            return (children[ch - 'a'] != null);
        }
    }
    
    public void insert(String word,Node curr)
    {
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.contains(ch)==false)
                curr.add(ch);
            curr=curr.get(ch);
        }
        curr.setTerminal();
    }
    int [][]dr={{0,-1},{0,1},{1,0},{-1,0}};//up,down,right,left//x,y
    public void ifExist(int row,int col,char[][]board,String asf,Node curr)
    {
        if(curr==null)
            return ;
        if(curr.isTerminal()==true)
            res.add(asf);
        if(row<0||col<0||row>=board.length||col>=board[0].length||board[row][col]=='-')
            return ;
        for(int i=0;i<4;i++)
        {
            char ch= board[row][col];
        board[row][col]='-';
        ifExist(row+dr[i][1],col+dr[i][0],board,asf+ch,curr.get(ch));
                 board[row][col]=ch;   
        }
    }
    HashSet<String> res;
    public List<String> findWords(char[][] board, String[] words) {
        res=new HashSet<>();
        Node root=new Node();
        for(String word:words)
            insert(word,root);
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
                ifExist(i,j,board,"",root);
        }
List<String> ans=new ArrayList<>();
        for(String word:res)
            ans.add(word);
        return ans;
    }
}
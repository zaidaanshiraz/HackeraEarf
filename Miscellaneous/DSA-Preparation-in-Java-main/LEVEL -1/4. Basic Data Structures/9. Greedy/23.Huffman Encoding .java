//https://practice.geeksforgeeks.org/problems/huffman-encoding3345/1

class Solution {
    public static class Node implements Comparable<Node>
    {
        char ch;
        int freq;
        Node left;
        Node right;
        Node(char ch,int freq)
        {
            this.ch=ch;
            this.freq=freq;
            this.left=null;
            this.right=null;
        }
        public int compareTo(Node other)
        {
            return this.freq-other.freq;
        }
    }
    ArrayList<String> encoding;
    public void preorder(Node root,String str)
    {
        if(root.left==null&&root.right==null)
        {
            encoding.add(str);
            return ;
        }
        if(root.left!=null)
        preorder(root.left,str+"0");
        if(root.right!=null)
        preorder(root.right,str+"1");
    }
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        // Code here
         PriorityQueue<Node> q=new PriorityQueue<>();
         for(int i=0;i<N;i++)
         {
             q.add(new Node(S.charAt(i),f[i]));
         }
         while(q.size()>1)
         {
             Node left=q.remove();
             Node right=q.remove();
             Node root=new Node('#',left.freq+right.freq);
             root.left=left;
             root.right=right;
             q.add(root);
         }
         Node root=q.remove();
         encoding=new ArrayList<>();
        preorder(root,"");
        return encoding;
    }
}
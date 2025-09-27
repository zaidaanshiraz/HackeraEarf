//https://leetcode.com/problems/stream-of-characters/

class StreamChecker {
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

    public void insert(Node curr, String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);

            if (curr.contains(ch) == false)
                curr.add(ch);

            curr = curr.get(ch);
        }

        curr.setTerminal();
    }

    Node root;

    public StreamChecker(String[] words) {
        root = new Node();
        for (String word : words)
            insert(root, word);
    }

    StringBuilder res=new StringBuilder();
    public boolean query(char letter) {
        res.append(letter);
        Node curr=root;
        for(int i=res.length()-1;i>=0;i--)
        {
            char ch=res.charAt(i);
            if(curr.isTerminal()==true)
                return true;
            if(curr.contains(ch)==false)
                return false;
            curr=curr.get(ch);
        }
        return curr.isTerminal();
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
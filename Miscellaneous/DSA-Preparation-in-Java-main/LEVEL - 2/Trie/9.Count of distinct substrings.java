//https://practice.geeksforgeeks.org/problems/count-of-distinct-substrings/1
class GfG
{
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
   public static int countDistinctSubstring(String st)
   {
       //your code here
       Node root=new Node();
      
       int count=1;
       for(int i=0;i<st.length();i++)
       {
            Node curr=root;
           for(int j=i;j<st.length();j++)
           {
               char ch=st.charAt(j);
               if(curr.contains(ch)==false)
               {curr.add(ch);
               count++;}
               curr=curr.get(ch);
           }
       }
      return count;

   }
}
//https://leetcode.com/problems/remove-duplicate-letters/

class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int val=hm.getOrDefault(ch,0)+1;
            hm.put(ch,val); //freq hashmap
            // set.add(ch); //unique characters(alphabets) 
            
        }
        for(int i=0;i<s.length();i++)
        {
char ch=s.charAt(i);
            if(set.contains(ch)==true)
            {
                hm.put(ch,hm.get(ch)-1);
                continue;
            }
           else if(stk.size()==0)
           {
               stk.push(ch);
               hm.put(ch,hm.get(ch)-1);
               set.add(ch);
           }
            else {
                while(stk.size()>0&&stk.peek()>ch&&hm.get(stk.peek())>0)
                {
                    char ch1=stk.pop();
                    set.remove(ch1);
                    
                }
                stk.push(ch);
                hm.put(ch,hm.get(ch)-1);
                set.add(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(stk.size()>0)
        {
            str.append(stk.pop());
        }
        return str.reverse().toString();
    }
}
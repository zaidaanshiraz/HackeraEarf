//https://leetcode.com/problems/reorganize-string/
class Solution {
    public static class Pair implements Comparable<Pair>
    {
        char ch;
        int val;
        Pair(char ch,int val)
        {
            this.ch=ch;
            this.val=val;
        }
        public int compareTo(Pair other)
        {
            if(this.val!=other.val)
                return other.val-this.val;
            return this.ch-other.ch;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:hm.keySet())
        {
            int val=hm.get(ch);
            Pair obj=new Pair(ch,val);
            pq.add(obj);
        }
        // while(pq.size()>0)
        // {
        //     Pair obj=pq.remove();
        //     System.out.print(obj.ch+"->"+obj.val+" ");
        // }
        
        if(pq.size()==1)
        {
            if(pq.peek().val==1)
                return pq.peek().ch+"";
            return "";
        }
        Pair a=pq.remove();
        Pair b=pq.remove();
        StringBuilder res=new StringBuilder();
        while(a!=null&&b!=null)
        {
            res.append(a.ch);
            res.append(b.ch);
            
            a.val=a.val-1;
            b.val=b.val-1;
            if(a.val!=0)
                pq.add(a);
            if(b.val!=0)
                pq.add(b);
            
            if(pq.size()>0)
                a=pq.remove();
            else a=null;
            if(pq.size()>0)
            b=pq.remove();
            else b=null;
          System.out.println("end");
            if(a!=null&&b!=null)
            System.out.println(a.ch+"&"+b.ch);
        }
       if(a!=null)
       {
           if(a.val==1)
           {
               res.append(a.ch);
               return res.toString();
           }
           else
               return "";
       }
        return res.toString();
    }
}
//Ques->https://nados.io/question/merge-k-sorted-lists?zen=true

//COde
import java.io.*;
import java.util.*;

public class Main {
   static class Pair implements Comparable <Pair>{
      int data;
      int li;
      int di;
      //return +ve mai bda hu 
      //return -ve dusra bda hai
      //return 0 dono equal hai
      public int compareTo(Pair o)
      {
         return this.data-o.data;
      }
   }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
      PriorityQueue<Pair> pq=new PriorityQueue<>();
      for(int li=0;li<lists.size();li++)
      {
         Pair p=new Pair();
         p.li=li;
         p.di=0;
         p.data=lists.get(li).get(0);
         pq.add(p);
      }
      while(pq.size()>0)
      {
         Pair rp=pq.peek();
         pq.remove();
         rv.add(rp.data);
         rp.di++;
         if(rp.di<lists.get(rp.li).size())
         {
            rp.data=lists.get(rp.li).get(rp.di);
            pq.add(rp);
         }
      }
      return rv;

      // return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
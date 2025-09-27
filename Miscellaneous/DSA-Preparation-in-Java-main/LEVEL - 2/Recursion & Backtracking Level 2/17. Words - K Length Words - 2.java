//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-klength-words-2-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

 public static void permutation(String res,String ustr,HashSet<Character> unique,int k)
 {
     if(res.length()==k)
     {
         System.out.println(res);
         return ;
     }
     for(Character ch:ustr.toCharArray())
     {
         if(unique.contains(ch)==true)
         {
             unique.remove(ch);
             permutation(res+ch,ustr,unique,k);
             unique.add(ch);
         }
     }
 }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }

    permutation("",ustr,unique,k);
  }

}
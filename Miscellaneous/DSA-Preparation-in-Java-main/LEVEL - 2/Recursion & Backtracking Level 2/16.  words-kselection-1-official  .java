//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-4-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void generateSelection(String ustr, int cs, int ts, int lc, HashMap<Character, Integer> freq, String asf) {
    if (cs > ts) {
      System.out.println(asf);
      return;
    }
    if(lc == ustr.length()){
        return;
    }

    for (int i = lc; i < ustr.length(); i++) {
        int oldFreq = freq.get(ustr.charAt(i));
        if(oldFreq > 0){
            freq.put(ustr.charAt(i), oldFreq - 1);
            generateSelection(ustr, cs + 1, ts, i, freq, asf + ustr.charAt(i));
            freq.put(ustr.charAt(i), oldFreq);
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
          unique.put(ch, unique.get(ch) + 1);
      }
    }

    generateSelection(ustr, 1, k, 0, unique, "");
  }

}
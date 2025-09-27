//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-3-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {

public static void combination(int currentChar, String ustr, HashMap<Character, Integer> freq, String res, int k){
    if(res.length() == k){
        System.out.println(res);
        return;
    }
    
    if(currentChar == ustr.length()){
        return;
    }
    
    int val = freq.get(ustr.charAt(currentChar));
    for(int i=val; i>=0; i--){
        if(i + res.length() > k){
            continue;
        }
        
        String newRes = res;
        for(int j=1; j<=i; j++){
            newRes = newRes + ustr.charAt(currentChar);
        }
        
        combination(currentChar + 1, ustr, freq, newRes, k);
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
    
    combination(0, ustr, unique, "", k);
  }

}
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/abbreviation-suing-backtracking-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {
public static List<String> res;

    public static void generateAbb(String input, int idx, String output, int count) {
        if (idx == input.length()) {
            if (count > 0)
                res.add(output + count);
            else
                res.add(output);
            return;
        }

        char ch = input.charAt(idx);
        generateAbb(input, idx + 1, output + ((count == 0) ? "" : count) + ch, 0); // yes
        generateAbb(input, idx + 1, output, count + 1); // no
    }

    public static List<String> generateAbbreviations(String word) {
        res = new ArrayList<>();
        generateAbb(word, 0, "", 0);
        return res;
    }
    public static void solution(String str, String asf,int count, int pos){
        //write your code here
        List<String> obj=generateAbbreviations(str);
        for(String ans:obj)
        System.out.println(ans);
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
    
    
}
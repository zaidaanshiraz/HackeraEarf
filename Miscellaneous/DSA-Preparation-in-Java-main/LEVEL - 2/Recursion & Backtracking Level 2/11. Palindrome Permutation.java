//https://www.hackerearth.com/problem/algorithm/palindrome-check-2-1/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int []freq=new int[27];
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           freq[ch-'a']++;

        }
        int count=0;
        for(int i=0;i<freq.length;i++)
        {
if(freq[i]%2==1)
count++;
if(count>1)
{
    System.out.println("NO");
    return ;
}
        }
        System.out.println("YES");
    }
}

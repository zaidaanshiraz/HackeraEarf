//Ques->https://www.hackerrank.com/challenges/simple-text-editor/problem


//Code->
import java.io.*;
import java.util.*;

public class Solution {
    static StringBuilder ans=new StringBuilder();
    static Stack<String> prev=new Stack<>();
//    public static int findChoice(String s)
//    {
//        char ch=s.charAt(0);
//        return (ch-'0');
//    }
    public static void append(String s)
    {
        prev.push(ans.toString());
        String []sArr=s.split(" ",2);
        ans.append(sArr[1]);
//        System.out.println(ans);
    }
    public static void delete(String s)
    {
        prev.push(ans.toString());
        String []sArr=s.split(" ",2);
        int delete=Integer.parseInt(sArr[1]);
        int length=ans.length()-1;
        while(delete-->0)
        {
            ans.deleteCharAt(length);
            length--;
        }
      //  System.out.println(ans);
    }
    public static void print(String s)
    {
//      String printans= ans.toString();
        if(ans.length()==0)
        {
            System.out.println(" ");
            return ;
        }
        String []sArr=s.split(" ",2);
        int idx=Integer.parseInt(sArr[1]);
        System.out.println(ans.charAt(idx-1));

    }
    public static void undo()
    {
        ans=new StringBuilder(prev.pop());
      //  System.out.println(ans);

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        String []strArr=new String[n+1];
        for(int i=0;i<=n;i++)
        {
            String s=scn.nextLine();
            strArr[i]=s.trim();
 //           System.out.println(strArr[i]);
        }
        for(int i=1;i<=n;i++){
            String str=strArr[i];
           int choice = str.charAt(0)-'0';
            switch(choice)
            {
                case 1:append(str);
                    break;
                case 2:delete(str);
                    break;
                case 3:print(str);
                    break;
                case 4:undo();
                    break;
            }
        }
    }
}
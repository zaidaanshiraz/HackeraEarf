//Ques->https://nados.io/question/highest-frequency-character?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(fmap.containsKey(ch)==false)
            {
                fmap.put(ch,1);
            }else
            {
                int of=fmap.get(ch);
                int nf=of+1;
                fmap.put(ch,nf);
            }
        }
        char mfch=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(fmap.get(ch)>fmap.get(mfch))
            {
                mfch=ch;
            }
              }
              System.out.println(mfch);
    }

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-kpc-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {
    static String[]doc={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
String str=scn.next();
ArrayList<String> res=getKPC(str);
System.out.print(res);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char  ch=str.charAt(0);//5
        String subs=str.substring(1);//73
        ArrayList<String> res=getKPC(subs);
        ArrayList<String> ans=new ArrayList<>();
        String firstch=doc[ch-'0'];
        for(int i=0;i<firstch.length();i++)
        {
            char alpha=firstch.charAt(i);
            for(String each:res)
            {
                ans.add(alpha+each);
            }
        }
        return ans;
}
}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> obj=gss(str);
        System.out.print(obj);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> last=new ArrayList<>();
            last.add("");
            return last;
        }
        char ch=str.charAt(0);
        String smallString=str.substring(1);
        ArrayList<String> smallres=gss(smallString);
        ArrayList<String> res=new ArrayList<>();
        for(String val:smallres)
        {
            res.add(""+val);
         //   res.add(ch+val);
        }
                for(String val:smallres)
        {
          //  res.add(""+val);
            res.add(ch+val);
        }
        return res;
    }

}
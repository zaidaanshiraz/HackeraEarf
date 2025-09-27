//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-encodings-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
Scanner scn=new Scanner(System.in);
String str=scn.next();
printEncodings(str,"");
    }

    public static void printEncodings(String inp ,String out) {
        if(inp.length()==0)
        {
            System.out.println(out);
            return ;
        }
      char ch=inp.charAt(0);
      String rem=inp.substring(1);
      if(ch!='0')
      printEncodings(rem,out+(char)('a'+((ch-'0')-1)));
      if(inp.length()>=2)
      {
      String alpha=inp.substring(0,2);
      String rem1=inp.substring(2);
      int val=Integer.parseInt(alpha);
      if(val>=10&&val<=26)
      printEncodings(rem1,out+(char)('a'+(val-1)));
      }
      
}

}
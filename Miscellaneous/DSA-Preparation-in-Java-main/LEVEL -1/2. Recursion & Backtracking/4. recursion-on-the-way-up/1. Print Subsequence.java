//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
String str=scn.next();
printSS(str,"");
    }

    public static void printSS(String ques, String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return ;
        }
        
        char ch=ques.charAt(0);
        String res=ques.substring(1);
         printSS(res,ans+ch);
        printSS(res,ans+"");
       
    }

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-kpc-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
String str=scn.next();
printKPC(str,"");
    }
static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String ques, String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return ;
        }
        char ch=ques.charAt(0);
        String rem=ques.substring(1);
        String str=codes[ch-'0'];
        for(int i=0;i<str.length();i++)
        {
            char alp=str.charAt(i);
            printKPC(rem,ans+alp);
        }
}

}
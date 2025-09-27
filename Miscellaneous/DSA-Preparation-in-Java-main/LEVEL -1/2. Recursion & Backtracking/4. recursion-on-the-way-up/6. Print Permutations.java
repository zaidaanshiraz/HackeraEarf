//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-permutations-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn=new Scanner (System.in);
      String str=scn.next();
   //   System.out.println(printPermutationNumber(str.length()));
      permutations(str,"");
    }
 
  public static void permutations(String ques,String asf)
  {
      if(ques.length()==0)
      {
          System.out.println(asf);
          return;
      }
for(int i=0;i<ques.length();i++)
{
    char ch=ques.charAt(i);
    String lpart=ques.substring(0,i);
   String rpart=ques.substring(i+1);
   permutations(lpart+rpart,asf+ch);
   
}
    
  }
}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/fibonacci-till-n-official/ojquestion

//Code->
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn= new Scanner(System.in);
      int a=0,b=1,c;
      int n=scn.nextInt();
      int i=1;
      System.out.println(a);
      System.out.println(b);
      while(i<=n-2)
      {
          c=a+b;
          System.out.println(c);
          a=b;
          b=c;
          i++;
      }
      
   }
  }
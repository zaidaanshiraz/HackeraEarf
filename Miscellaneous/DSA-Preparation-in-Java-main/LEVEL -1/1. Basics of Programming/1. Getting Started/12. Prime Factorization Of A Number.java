//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/prime-factorization-official/ojquestion

//Code->
import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  int i=2;
  while(n!=1)
  {
      if(n%i==0)
      {
      System.out.print(i+" ");
      n=n/i;}
      else
      i++;
      
  }
 }
}
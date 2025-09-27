//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/benjamin-bulbs-official/ojquestion

//Code->
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here 
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int div=1;
    while(div*div<=n)
    {
        System.out.println(div*div);
        div++;
    }
   }
  }
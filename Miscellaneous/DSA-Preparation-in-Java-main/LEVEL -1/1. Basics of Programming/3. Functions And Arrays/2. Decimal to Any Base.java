//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/decimal-to-any-base-official/ojquestion

//Code->
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
         Scanner scn = new Scanner(System.in);
      //  int n=scn.nextInt();
      //  int b=scn.nextInt();
        int p=0;
        int rem,ans=0;
        while(n!=0)
        {
            rem=n%b;
            ans = ans + rem*(int)(Math.pow(10,p)) ;
            n/=b;
            p++;


        }
        return ans;
   }
  }
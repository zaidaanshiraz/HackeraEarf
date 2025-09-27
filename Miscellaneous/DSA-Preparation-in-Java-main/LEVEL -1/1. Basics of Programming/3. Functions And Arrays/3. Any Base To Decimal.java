//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-to-decimal-official/ojquestion

//Code->
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
    
    int p=0,rem=1,ans=0;
    while(n!=0)
    {
        rem=n%10;
        ans=ans + rem*(int)(Math.pow(b,p));
        n=n/10;
        p++;
    }
    return ans;
}

   
  }
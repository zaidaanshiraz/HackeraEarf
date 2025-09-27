//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/gcd-and-lcm-official/ojquestion

//Code->
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
       Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        if(b>a)
        {
            int temp=a;
            a=b;
            b=temp;
        }
        //GCD
        for(int i=b;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            { System.out.println(i);
                break;}
        }
        //lcm
int least=1;
        int j=1;
        while(j<=Integer.MAX_VALUE)
        {
            if((b*j)%a==0) {
                least = b * j;
                System.out.println(least);
                break;

                }
j++;
        }



     }
    }
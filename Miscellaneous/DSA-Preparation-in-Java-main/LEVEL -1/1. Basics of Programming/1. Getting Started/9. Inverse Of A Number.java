//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number-official/ojquestion

//Code->
import java.util.*;
public class Main{
    public static void main(String[] args) {
// write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ifv=1;
        int ip,sum=0;
        while(n!=0)
        {
            ip=n%10;
            sum=sum+(ifv*(int)(Math.pow(10,ip-1)));
                    n=n/10;
            ifv++;
        }
        System.out.println(sum);
        }
    }
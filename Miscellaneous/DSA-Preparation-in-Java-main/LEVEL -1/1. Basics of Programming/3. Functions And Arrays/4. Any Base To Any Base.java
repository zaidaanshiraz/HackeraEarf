//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-to-any-base-official/ojquestion

//Code->
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        n1=anybasetodecimal(n1,b1);
        n1=decimaltobase(n1,b2);
        System.out.println(n1);
    }
  static  int anybasetodecimal(int n1,int b1)
    {
        int mul=1,d1,num=0;
        while(n1>0)
        {
            d1=n1%10;
            num=num+d1*mul;
            mul*=b1;
            n1/=10;
        }return num;
    }
  static  int decimaltobase(int n1,int b2)
    {int mul=1,d1,num=0;
        while(n1>0)
        {
            d1=n1%b2;
            d1=n1%b2;
            num=num+d1*mul;
            mul*=10;
            n1/=b2;

        }
        return num;
    }
}
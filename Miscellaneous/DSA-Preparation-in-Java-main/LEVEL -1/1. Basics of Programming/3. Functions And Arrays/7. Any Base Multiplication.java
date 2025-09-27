//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-multiplication-official/ojquestion

//Code->
import java.util.*;

public class Main{


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
int d;
         d = anymul(b,n1,n2);
        System.out.println(d);
    }
    public static int anymul(int b, int n1, int n2){
        // write your code here8
        int pro,mul=1,t=0;
        while(n2>0)
        {
            pro=product(n1,n2%10,b);
            t=getSum(b,pro*mul,t);
            mul*=10;
            n2/=10;

        }
        return  t;
    }
 public static int product(int n1,int n2,int base)
{int res=0,mul=1,borrow=0,d1,d2,temp;
    while(borrow>0 || n1>0)
    {
        d1=n2;
        d2=n1%10;
        temp=d2*d1+borrow;
        res=res+(temp%base)*mul;
        borrow=temp/base;
        n1/=10;
        mul*=10;
    }
    return res;
}
public static int getSum(int b, int n1, int n2){
        // write ur code here
        int carry=0,multiplier=1,res=0,d1,d2,temp,quant,remain;
        while(carry>0||n1>0||n2>0){
            d1=n1%10;
            d2=n2%10;
            temp=carry+d1+d2;
            quant=temp/b;
            remain=temp%b;
            carry=quant;
            res+=remain*multiplier;
            multiplier*=10;
            n1/=10;
            n2/=10;
        }
        return res;

    }


}
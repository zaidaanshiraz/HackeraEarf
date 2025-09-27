//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion

//Code->
import java.io.*;
import java.util.*;
//import java.util.Scanner*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int [] a =new int[n];

        for(int i=0;i<n;i++)
            a[i]=scn.nextInt();
        int t=(int)Math.pow(2,n);
        int power;
        for(int i=0;i<t;i++)
        {
            power=(int)Math.pow(10,n-1);
            int binaryno=numbertobinary(i);
            for(int j=0;j<n;j++)
            {
                int bit=(binaryno/power)%10;
                if(bit==1)
                    System.out.print(a[j]+"	");
                else
                    System.out.print("-	");
                power/=10;
            }
            System.out.println();

        }
    }
    static int numbertobinary(int num)
    {int d1,ans=0,mul=1;
        while(num>0)
        {
            d1=num%2;
            ans=ans+(d1*mul);
            mul*=10;

            num/=2;
        }return ans;
    }

}
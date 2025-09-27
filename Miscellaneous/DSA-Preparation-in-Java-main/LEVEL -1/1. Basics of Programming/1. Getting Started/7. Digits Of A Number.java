//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/digits-of-a-number-official/ojquestio

//Code->
import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=n;
        int count =0;
        while(m!=0)
        {
            m=m/10;
            count++;
        }
        //System.out.println(count);
        int div=1;
        for(int i=1;i<=count -1;i++)
            div=div*10;
        int temp=n;
        //System.out.println(div);
        while(div!=0)
        {
            System.out.println(temp/div);
            temp=temp%div;
            div=div/10;

        }
    }
}
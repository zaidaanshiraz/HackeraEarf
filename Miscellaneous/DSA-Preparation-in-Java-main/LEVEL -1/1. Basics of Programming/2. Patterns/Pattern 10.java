//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-10-official/ojquestion

//Code->
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int dec=n/2;
        int inc=1;
        for(int i=1;i<=(n/2)+1;i++)
        {
            for(int j=1;j<=dec;j++)
                System.out.print("	");
            System.out.print("*	");
            for(int j=1;j<=inc;j++)
            {if(i==1)
                break;
                System.out.print("	");
            }
            if(i!=1)
                System.out.print("*");
            System.out.println();
dec--;
if(i!=1)
inc=inc+2;
        }
        inc=1;
        dec=n-4;
        for(int i=(n/2)+2;i<=n;i++)
        {
            for(int j=1;j<=inc;j++)
                System.out.print("	");
            System.out.print("*	");
            for(int j=1;j<=dec;j++)
                System.out.print("	");
            if(i!=n)
                System.out.print("*");
            System.out.println();
            dec=dec-2;
                inc++;
        }

    }}
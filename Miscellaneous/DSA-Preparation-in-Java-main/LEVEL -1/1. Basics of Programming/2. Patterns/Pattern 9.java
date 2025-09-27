//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-9-official/ojquestion

//Code->
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int dec=n-2;
        for(int i=1;i<=(n/2)+1;i++)
        {
            for(int j=1;j<=i-1;j++)
                System.out.print("	");
            System.out.print("*	");
            for(int j=1;j<=dec;j++)
                System.out.print("	");
            if(i!=(n/2)+1)
                System.out.print("*");
            dec=dec-2;
            System.out.println();

        }
        dec=((n/2)-1);
        int inc=1;
        for(int i=((n/2)+2);i<=n;i++)
        {
            for(int j=1;j<=dec;j++)
            System.out.print("	");
            System.out.print("*	");
            for(int j=1;j<=inc;j++)
                System.out.print("	");
            System.out.print("*");
            dec--;
            inc=inc+2;
            System.out.println();
        }
    }
}
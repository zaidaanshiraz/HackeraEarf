//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-12-official/ojquestion

//Code->
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int a =0,b=1,c;
        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
        {
            System.out.print(a+"	");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();}

    }
}
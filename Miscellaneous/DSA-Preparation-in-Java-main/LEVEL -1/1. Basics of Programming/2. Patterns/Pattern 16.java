//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-16-official/ojquestion

//Code->
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+"	");
            for(int j=1;j<=((2*n)-1)-2*i;j++)
                System.out.print("	");
            for(int j=i;j>=1;j--)
                if(j!=n)
                System.out.print(j+"	");
            System.out.println();
        }

    }
}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-8-official/ojquestion

//Code->
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            System.out.print("	");
            System.out.print("*");
             System.out.println();
            
        }

    }
}
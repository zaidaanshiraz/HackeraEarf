//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-14-official/ojquestion

//Code->
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d",n,i,n*i);
            System.out.println();
        }

    }
}
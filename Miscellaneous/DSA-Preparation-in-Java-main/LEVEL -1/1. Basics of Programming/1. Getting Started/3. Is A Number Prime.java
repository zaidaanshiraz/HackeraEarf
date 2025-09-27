//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/is-number-prime-official/ojquestion

//code->
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int m=scn.nextInt();

        for (int t=1;t<=m;t++) {
            int n = scn.nextInt();
            int count=0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }

            if (count != 0)
                System.out.println("not prime");
            else
                System.out.println("prime");
        }

    }
}
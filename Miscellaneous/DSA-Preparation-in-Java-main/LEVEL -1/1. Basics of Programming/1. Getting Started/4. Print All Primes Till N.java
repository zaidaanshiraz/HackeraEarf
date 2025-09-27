//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/print-all-primes-till-n-official/ojquestion

//Code->
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        int n = low;
        while (n <= high) {
            int count = 0;
            int fac = 2;
            while (fac * fac <= n) {
                if (n % fac == 0){
                    count++;
                    break;}
                else
                    fac++;
            }
            if (count == 0)
                System.out.println(n);
            n++;

        }
    }
}
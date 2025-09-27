//Ques->https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion

//Code->
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int k = scn.nextInt();
            int temp = n;
            int count = 0, no;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            k = k % count;
            if (k < 0)
                k = k + count;

            int a = n / ((int) (Math.pow(10, k)));
            int b = n % ((int) (Math.pow(10,k)));
            no = b * ((int) (Math.pow(10, count - k))) + a;
            System.out.println(no);

    }
   }
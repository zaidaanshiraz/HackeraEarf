//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sum-of-two-arrays-official/ojquestion

//Code->
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //  int b = scn.nextInt();
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }
        int max = Math.max(n1, n2) + 1;
        int[] a3 = new int[max];
        int carry = 0, temp, quant, remain,d1,d2,b1=n1-1,b2=n2-1;
        for (int i =max-1; i >= 0; i--) {
            d2=b2<0?0:a2[b2];
            d1=b1<0?0:a1[b1];

                temp = carry + d1+d2;
                quant = temp / 10;
                remain = temp % 10;
                carry = quant;
                a3[i] = remain;
                b1--;
                b2--;

        }
        int index=0;
        if(a3[index]==0)
            index++;
        for (int i = index; i <max; i++)
            System.out.println(a3[i]);
    }
}
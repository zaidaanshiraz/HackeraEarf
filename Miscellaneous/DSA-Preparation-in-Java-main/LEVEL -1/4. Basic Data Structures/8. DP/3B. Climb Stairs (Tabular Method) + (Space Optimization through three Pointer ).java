//Ques->https://nados.io/question/climb-stairs?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int prev1=1,prev2=0,prev3=0;
        for(int i=1;i<=n;i++)
        {
            int curr=prev1+prev2+prev3;
            prev3=prev2;
            prev2=prev1;
            prev1=curr;
        }
System.out.println(prev1);
    }

}
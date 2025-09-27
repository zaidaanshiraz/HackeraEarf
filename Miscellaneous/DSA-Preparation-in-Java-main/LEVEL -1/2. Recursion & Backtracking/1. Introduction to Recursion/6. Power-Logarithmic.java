//Ques->https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-logarithmic-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
       int ans= power(x,n);
       System.out.print(ans);
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;
        int pwxn=power(x,n/2);
        if(n%2==1)
        return x*pwxn*pwxn;
        else
        return pwxn*pwxn;
        
        
    }

}
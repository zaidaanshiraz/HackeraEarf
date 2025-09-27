//Ques->https://nados.io/question/arrange-buildings?zen=true

//COde
//Ques->https://nados.io/question/count-binary-strings?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    long old_zero=1;
    long old_one=1;
    for(int i=2;i<=n;i++)
    {
        long new_one=old_zero+old_one;
        long new_zero=old_one;
        old_zero=new_zero;
        old_one=new_one;
    }
    long oneside=old_zero+old_one;
    long ways=oneside*oneside;
    System.out.println(ways);
 }

}
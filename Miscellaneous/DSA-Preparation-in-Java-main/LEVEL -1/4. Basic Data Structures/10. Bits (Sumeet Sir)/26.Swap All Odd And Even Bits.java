//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/swap-all-odd-and-even-bits-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    int on=0x55555555;
    int em=0xAAAAAAAA;
    int odds=(n&on);
    int evens=(n&em);
    odds<<=1;
    evens>>=1;
    n=odds|evens;
    System.out.println(n);
  }

}
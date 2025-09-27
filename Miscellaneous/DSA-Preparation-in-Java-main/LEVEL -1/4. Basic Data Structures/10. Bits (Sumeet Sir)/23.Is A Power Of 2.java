//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/is-a-power-of-2-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    int val=(n&(n-1));
    if(val==0)
    System.out.println(true);
    else
    System.out.println(false);
  }

}
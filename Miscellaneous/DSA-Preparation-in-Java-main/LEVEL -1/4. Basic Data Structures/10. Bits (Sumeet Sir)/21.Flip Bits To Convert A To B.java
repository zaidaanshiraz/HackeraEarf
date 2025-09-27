//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/flip-bits-to-convert-a-to-b-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    //write your code here
    int flipped=a^b;
    int count=0;
    while(flipped!=0)
    {
        int rsb=(flipped&-flipped);
        flipped-=rsb;
        count++;
    }
    System.out.println(count);
  }

}
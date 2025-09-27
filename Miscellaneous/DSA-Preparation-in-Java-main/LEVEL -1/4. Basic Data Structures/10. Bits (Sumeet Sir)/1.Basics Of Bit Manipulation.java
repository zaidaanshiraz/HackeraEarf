//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/basics-of-bit-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    int setMask=(1<<i);
    int unsetMask=~(1<<j);
    int toogleMask=(1<<k);
    int bitcheckMask=(1<<m);
    
    System.out.println(n|setMask);
        System.out.println(n&unsetMask);
            System.out.println(n^toogleMask);
                System.out.println(((n&bitcheckMask)==0)?false:true);
  }

}
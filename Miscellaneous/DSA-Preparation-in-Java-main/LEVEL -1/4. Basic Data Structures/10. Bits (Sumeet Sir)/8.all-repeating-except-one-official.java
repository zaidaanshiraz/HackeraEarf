//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/all-repeating-except-one-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int unique=0;
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
      unique^=arr[i];
    }
    System.out.println(unique);
    //write your code here
    
  }

}
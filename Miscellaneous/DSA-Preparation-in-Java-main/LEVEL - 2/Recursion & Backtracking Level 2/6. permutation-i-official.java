//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutation-i-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(int[] boxes, int itemNo, int ritems){
    // write your code herei
    if(itemNo==ritems)
    {
        for(int a:boxes)
        System.out.print(a);
        System.out.println();
        return ;
    }
    for(int i=0;i<boxes.length;i++)
    {
        if(boxes[i]==0){
       boxes[i]=itemNo+1;
       permutations(boxes,itemNo+1,ritems);
       boxes[i]=0;
        }
    
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(new int[nboxes], 0, ritems);
  }

}
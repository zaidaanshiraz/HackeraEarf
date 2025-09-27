//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/combinations-2-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void combinations(int[] boxes, int itemNo,int ritems,int lastIdx){
    // write your code here
    if(itemNo==ritems)
    {
        for(int a:boxes)
        {
            if(a>0)
        System.out.print('i');
            else
            System.out.print('-');
        }
        System.out.println();
    }
    for(int i=lastIdx+1;i<boxes.length;i++)
    {
        if(boxes[i]==0)
        {
            boxes[i]=itemNo+1;
            combinations(boxes,itemNo+1,ritems,i);
            boxes[i]=0;
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    combinations(new int[nboxes], 0, ritems, -1);
  }

}
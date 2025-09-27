//Ques->https://nados.io/question/longest-consecutive-sequence-of-elements?zen=true

//Code
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    HashMap<Integer,Boolean> map=new HashMap<>();
    for(int val:arr)
    {
        map.put(val,true);
    }
    for(int val:arr)
    {
        if(map.containsKey(val-1)==true)
        {
            map.put(val,false);
        }
    }
    int msp=0;
    int mlen=0;
    for(int val:arr)
    {
        if(map.get(val)==true)
        {
            int tsp=val;
            int tlen=1;
            while(map.containsKey(tsp+tlen)==true)
            {
                tlen++;
            }
            if(tlen>mlen)
            {
                msp=tsp;
                mlen=tlen;
            }
        }
    }
    for(int i=0;i<mlen;i++)
    {
        System.out.println(msp+i);
    }


 }

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/first-index-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
        int data=scn.nextInt();
        int idx=firstIndex(arr,0,data);
        System.out.println(idx);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length-1)
        return -1;
       if(arr[idx]==x)
       return idx;
       else
     {  int idxsub = firstIndex(arr,idx+1,x);
       return idxsub;}
    }

}
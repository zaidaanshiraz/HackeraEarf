//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/last-index-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
        int target=scn.nextInt();
        System.out.print(firstIndex(arr,n-1,target));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx<0)
        return -1;
        if(arr[idx]==x)
        return idx;
        else
        return firstIndex(arr,idx-1,x);
    }
}
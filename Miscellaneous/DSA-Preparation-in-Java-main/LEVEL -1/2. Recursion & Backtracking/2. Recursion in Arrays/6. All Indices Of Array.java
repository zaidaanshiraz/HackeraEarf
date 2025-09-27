//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/all-indices-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int target, int idx, int count) {
        // write ur code here
        int []res;
        if(idx==arr.length)
        {
            int []base =new int[count];
            return base;
        }
        if(arr[idx]==target)
        {
            res=allIndices(arr,target,idx+1,count+1);
            res[count]=idx;
            return res;
            
        }
        else
        {
            res=allIndices(arr,target,idx+1,count);
            return res;
            
        }
    }

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-in-reverse/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
    arr[i]=scn.nextInt();
        }
        displayArr(arr,n-1);
        
    }

    public static void displayArr(int[] arr, int idx){
        if(idx<0)
        return ;
        System.out.println(arr[idx]);
        displayArr(arr,idx-1);
    }
}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/find-element-in-array-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{
    static int  check(int ele,int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
                return i;
        } return -1;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n,ele;
        Scanner scn =new Scanner(System.in);
         n=scn.nextInt();
           int [] arr = new int[n];
      
       
          for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        ele=scn.nextInt();
     
        System.out.println(check(ele,arr));


    }

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference-of-two-arrays-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int [] a= new int[n1];
    for(int i=0;i<n1;i++)
    a[i]=scn.nextInt();
     int n2=scn.nextInt();
    int [] b= new int[n2];
    for(int i=0;i<n2;i++)
    b[i]=scn.nextInt();
    int []d=new int[n2];
    n1--;
    int temp,borrow=0;
    for(int i=d.length-1;i>=0;i--)
    {
        int alv=n1<0?0:a[n1];
        temp=b[i]-alv+borrow;
       if(temp>=0)
       { d[i]=temp;
        borrow=0;}
        else
        {
            d[i]=temp+10;
            borrow=-1;
        }
        n1--;
    }
    int idx=0;
    while(d[idx]==0)
    {
        idx++;
    }
    for(int i=idx;i<d.length;i++)
    System.out.println(d[i]);
 }

}
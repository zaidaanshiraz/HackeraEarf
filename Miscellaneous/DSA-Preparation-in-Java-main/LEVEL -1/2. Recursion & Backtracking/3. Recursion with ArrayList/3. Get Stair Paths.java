//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-stair-paths-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();

ArrayList<String>res=getStairPaths(n);
System.out.print(res)
;    }

    public static ArrayList<String> getStairPaths(int n) {
     
     if(n==0)
     {
         ArrayList<String> base=new ArrayList<>();
         base.add("");
         return base;
     }
     else if(n<0)
     {
         ArrayList<String> base=new ArrayList<>();
      //   base.add("");
         return base;
     }
     ArrayList<String> paths1=getStairPaths(n-1);
     ArrayList<String> paths2=getStairPaths(n-2);
     ArrayList<String> paths3=getStairPaths(n-3);
      ArrayList<String>res=new ArrayList<>();
      for(String val:paths1)
      res.add(1+val);
            for(String val:paths2)
      res.add(2+val);
            for(String val:paths3)
      res.add(3+val);
      return res;
      
    }
}
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/gray-code/ojquestion

import java.util.*;
 
 public class Main {
 
     public static ArrayList<String> grayCode(int n) {
 	 //Write your code here
 	 if(n==1)
 	 {
 	     ArrayList<String> obj=new ArrayList<>();
 	     obj.add("0");
 	     obj.add("1");
 	     return obj;
 	 }
 	 	 //Write your code here
 	 if(n==0)
 	 {
 	     ArrayList<String> obj=new ArrayList<>();
 	     obj.add("0");
 	  //   obj.add("1");
 	     return obj;
 	 }
 	 ArrayList<String> lowbit=grayCode(n-1);
 	 ArrayList<String> ans=new ArrayList<>();
 	 for(int i=0;i<lowbit.size();i++)
 	 {
 	     String bitNumber=lowbit.get(i);
 	     ans.add("0"+bitNumber);
 	 }
 	  for(int i=0;i<lowbit.size();i++)
 	 {
 	     String bitNumber=lowbit.get(lowbit.size()-1-i);
 	     ans.add("1"+bitNumber);
 	 }
 	 return ans;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         ArrayList<String> ans=grayCode(scn.nextInt());
         ArrayList<Integer> obj=new ArrayList<>();
         for(String res:ans)
         {
             int val=Integer.parseInt(res,2);
             obj.add(val);
         }
         Collections.sort(obj);
         System.out.println(obj);
     }
 }
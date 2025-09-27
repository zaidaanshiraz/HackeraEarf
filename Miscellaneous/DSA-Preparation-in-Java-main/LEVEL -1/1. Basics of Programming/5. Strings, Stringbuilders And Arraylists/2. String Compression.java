//Ques->https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-compression-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
//int freq=0;

    String output="";
    for(int i=0;i<str.length();i++)
    {
        if(i==0||str.charAt(i)!=str.charAt(i-1))
 {   // {   // if(freq>1)
          //  output+=freq;
      // freq=0;}
        
        output+=str.charAt(i);
     //  freq++;
    }
    
   
}
		return output;
	}

	public static String compression2(String str){
		// write your code here

		int freq=0;

    String output="";
    for(int i=0;i<str.length();i++)
    {
        if(i==0||str.charAt(i)!=str.charAt(i-1))
     {    if(freq>1)
           { output+=freq;
       }
        
        output+=str.charAt(i);
       freq=0;
    }
    freq++;
    }
    if(freq>1)
    output+=freq;
    return output;
    
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
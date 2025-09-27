//Ques->https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-palindromic-substrings-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
	    boolean found=true;
		//write your code here
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i;j<str.length();j++)
		    {
		       String t= str.substring(i,j+1);
		      found= isPalindrome(t,0,t.length()-1);
		      if(found)
		      System.out.println(t);
		 
		        
		    }
		}
		
	}
static	boolean isPalindrome(String s ,int start ,int end )
{
    while(start<end)
    {
        if(s.charAt(start)!=s.charAt(end))
        return false;
        start++;
        end--;
    }
    return true;
}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
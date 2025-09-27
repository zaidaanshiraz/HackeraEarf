//Ques->https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/toggle-case-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		String res="";
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(ch>='a' && ch<='z')
		    res=res+(char)(ch-32);
		    else
		    res=res+(char)(ch+32);
		}
		return res;

	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-with-difference-of-every-two-consecutive-characters-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
String output="";
int i=0;
while(i<str.length()-1)
{
    output+=str.charAt(i);
    output+=(str.charAt(i+1)-str.charAt(i));
    i++;
}
 output+=str.charAt(i);
		return output;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/remove-primes-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

public static boolean isPrime(int x)
{
    for(int i=2;i*i<=x;i++)
    {
        if(x%i==0)
        return false;
    }
    return true;
}
	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=0;i<al.size();i++)
		{
		    if(isPrime(al.get(i)))
		    {al.remove(i);
		    i--;}
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
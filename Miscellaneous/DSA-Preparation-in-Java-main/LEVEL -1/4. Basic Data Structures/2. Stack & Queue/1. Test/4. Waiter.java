//Ques->https://www.hackerrank.com/challenges/waiter/problem


//Code->
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static boolean isPrime(int number)
    {
        for(int i=2;i*i<=number;i++)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
    public static int[] primefind(int primeNumbers)
    {
        int []primes=new int[primeNumbers];
        int start=2;
        int idx=0;
        while(primeNumbers>0)
        {
            if(isPrime(start))
            {
                primes[idx++]=start;
                primeNumbers--;
            }
            start++;
        }
        return primes;
    }
    public static void main(String[] args) throws IOException {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int q=scn.nextInt();
        ArrayList<Integer> number=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int val=scn.nextInt();
            number.add(val);
        }
        Stack<Integer>A=new Stack<>();
        for(int i=0;i<number.size();i++)
        {
            A.push(number.get(i));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int []primes=primefind(q);
        for(int i=0;i<q;i++)
        {
            Stack<Integer>B=new Stack<>();
            Stack<Integer>helper=new Stack<>();
            while(A.size()>0)
            {
                if(A.peek()%primes[i]==0)
                    B.push(A.pop());
                else
                    helper.push(A.pop());
            }
            A=helper;
            while(B.size()>0)
                ans.add(B.pop());
        }
        while(A.size()>0)
            ans.add(A.pop());
        for(int each:ans)
            System.out.println(each);
    }
}

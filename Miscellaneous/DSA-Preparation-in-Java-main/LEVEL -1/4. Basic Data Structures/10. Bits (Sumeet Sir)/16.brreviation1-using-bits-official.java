//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/abrreviation1-using-bits-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void solve(String str){
        // write your code here
        for(int i=0;i<(1<<str.length());i++)
        {
            StringBuilder res=new StringBuilder();
        int count=0;
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                int bthbit=str.length()-1-j;
                if((i&(1<<bthbit))==0)
                {
if(count==0)
{
    res.append(ch);
}else
{
    res.append(count);
    res.append(ch);
    count=0;
}
                }else
                {
                    count++;
                }
            }
            if(count>0)
            res.append(count);
            System.out.println(res);
        }
        
    }
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);
    }
}
//https://www.spoj.com/problems/TEST/

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        for(int t = 1;t<=Test;t++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                String s = sc.next();
                arr[i] = sc.nextInt();
            }
            int bucket[] = new int[n + 1];
              for (int i = 0; i < n; i++)  
               bucket[arr[i]]++;  
            for (int i = 0, j = 0; i <= n; i++)  
            {  
                while (bucket[i] > 0)  
                {  
                    arr[j++] = i;  
                    bucket[i]--;  
                }  
            }  
            long sum = 0;
            for(int i = 0;i<n;i++)
                sum += Math.abs((i+1) - arr[i]);
            System.out.println(sum);
        }
	}
}
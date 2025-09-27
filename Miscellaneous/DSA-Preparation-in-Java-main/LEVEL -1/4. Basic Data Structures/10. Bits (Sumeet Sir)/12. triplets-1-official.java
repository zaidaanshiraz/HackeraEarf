//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/triplets-1-official/ojquestion

    import java.io.*;
    import java.util.*;
    
    public class Main {
    
    	public static void solution(int[] arr){
    		//write your code here
    	int c=0;
    	for(int i=0;i<arr.length;i++)
    	{int val=arr[i];
    	    for(int j=i+1;j<arr.length;j++)
    	    {
    	        val=val^arr[j];
    	        if(val==0)
    	        c+=j-i;
    	    }
    	}
    	System.out.println(c);
        }
    	public static void main(String[] args) {
    		Scanner scn = new Scanner(System.in);
    		int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < arr.length; i++){
                arr[i] = scn.nextInt();
            }
            solution(arr);
        }
    	
    	
    }
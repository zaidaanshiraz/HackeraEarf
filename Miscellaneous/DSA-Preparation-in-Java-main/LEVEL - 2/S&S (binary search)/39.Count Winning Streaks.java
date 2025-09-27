//https://nados.io/question/count-winning-streaks?zen=true

import java.util.*;

public class Main{

    public static long winningStreak(int[] arr){
        long ans=0;
        for(int st=0;st<arr.length;st++)
        {
            int countOf0s=0,countOf1s=0;
            for(int end=st;end<arr.length;end++)
            {
                if(arr[end]==0)
                countOf0s++;
                else 
                countOf1s++;
            
            if(countOf1s>countOf0s)
            ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(winningStreak(arr));
    }
}
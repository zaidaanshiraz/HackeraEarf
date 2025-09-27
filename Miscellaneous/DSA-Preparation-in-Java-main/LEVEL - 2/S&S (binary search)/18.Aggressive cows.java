//https://www.spoj.com/status/ns=29814004
import java.util.*;
import java.lang.*;

class Main
{
	public static boolean isPossible(int d, int []stalls, int c, int n){
	int placed = 1, placedAt = stalls[0];
	for(int i=1; i<n; i++){
		if(placedAt+d <= stalls[i]){
			placed++;
			placedAt = stalls[i];
		}
	}
	if(placed >= c)
		return true;
	return false;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
			int t=scn.nextInt();
			
	while(t-->0){
		int n=scn.nextInt();
		int c=scn.nextInt();
		int []stalls=new int[n];
		for(int i=0;i<stalls.length;i++)
		stalls[i]=scn.nextInt();
		
		
		Arrays.sort(stalls);
		int low = 1, high = stalls[n-1] - stalls[0];
		int ans = 1;
		while(low<=high){
			int mid = low + (high - low)/2;
			if(isPossible(mid, stalls, c, n)){
				ans = mid;
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		System.out.println(ans);
	}
    }
}

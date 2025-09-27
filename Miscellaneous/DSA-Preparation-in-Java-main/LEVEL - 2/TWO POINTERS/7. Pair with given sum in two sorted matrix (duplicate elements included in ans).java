//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/pairs-with-given-sum-in-two-sorted-matrices-official/ojquestion
import java.util.*;

public class Main {
	
    public static int solve(int[][] num1, int[][] num2, int k) {
		// write your code here
     int start=0;
int n=num1.length;
     int end=(n*n)-1;
     int count=0;
     
    while(start<n*n&&end>=0)
     {
         int rowFromStart=start/n;
         int colFromStart=start%n;
         int rowFromEnd=end/n;
         int colFromEnd=end%n;
         int sum=num1[rowFromStart][colFromStart]+num2[rowFromEnd][colFromEnd];
         if(sum==k)
         {
             
  for(int i=start;i<n*n;i++)
  {
      int a=i/n;
      int b=i%n;
      if(num1[a][b]+num2[rowFromEnd][colFromEnd]==k)
      count++;
      else  if(num1[a][b]+num2[rowFromEnd][colFromEnd]<k) continue;
      else break;
  }
end--;
         }
         else if(sum<k)
         start++;
         else 
         end--;
     }
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] mat1 = new int[N][N];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		int[][] mat2 = new int[N][N];
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		int K = sc.nextInt();
		System.out.println(solve(mat1, mat2, K));

	}

}
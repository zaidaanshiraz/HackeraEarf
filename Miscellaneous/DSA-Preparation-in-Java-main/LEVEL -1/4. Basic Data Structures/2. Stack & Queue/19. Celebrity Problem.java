//Ques->https://nados.io/question/celebrity-problem

//Code
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it''s index (not position), if there is not then
        // print "none"
        Stack<Integer> potentialCeleb=new Stack<>();
        for(int i=0;i<arr.length;i++)
        potentialCeleb.push(i);
        

        while(potentialCeleb.size()>1)
        {
            int y=potentialCeleb.pop();
            int x=potentialCeleb.pop();
            
            if(arr[x][y]==1)
            {
                potentialCeleb.push(y);
            }
            else
            {
                potentialCeleb.push(x);
            }
        }
    //    System.out.println(potentialCeleb);

        int x=potentialCeleb.pop();

        for(int j=0;j<arr.length;j++)
        {
            if(j==x)continue;
            if(arr[x][j]==1)
            {
                System.out.println("none");
                return ;
            }
        }
          for(int i=0;i<arr.length;i++)
        {
            if(i==x)continue;
            if(arr[i][x]==0)
            {
                System.out.println("none");
                return ;
            }
        }

System.out.println(x);

    }

}
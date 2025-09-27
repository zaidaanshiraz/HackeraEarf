//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-5-official/ojquestion

//Code->
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int st=1, sp=n/2;
 for( int i=1;i<=n;i++)
 {
     for(int j=1;j<=sp ; j++)
         System.out.print("	");
     for(int j=1;j<=st ; j++)
         System.out.print("*	");
     if(i>n/2)
     {
         sp=sp+1;
         st=st-2;
     }
     else
     {
         sp=sp-1;
         st=st+2;
     }
     System.out.println();

 }


    }
}
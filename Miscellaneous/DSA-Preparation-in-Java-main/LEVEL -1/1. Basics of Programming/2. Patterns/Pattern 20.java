//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-20-official/ojquestion

//Code->
import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n; j++)
      {
        if ( j == 1 || j == n) //if first or last column
        {
          System.out.print("*	");
        }
        else if (i > n / 2 && (i == j || i + j == n + 1)) // part of either diagonal below middle row
        {
          System.out.print("*	");
        }
        else
        {
          System.out.print("	");
        }
      }
      System.out.println();
    }
  }
}
//Ques->https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-13-official/ojquestion

//Code->
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        int ini;
        for(int i=0;i<n;i++)
        { ini=1;
            for(int j=0;j<=(i);j++)
            {
                System.out.print(ini+"	");
                ini=(ini*(i-j))/(j+1);
            }
            System.out.println();

        }

    }
}
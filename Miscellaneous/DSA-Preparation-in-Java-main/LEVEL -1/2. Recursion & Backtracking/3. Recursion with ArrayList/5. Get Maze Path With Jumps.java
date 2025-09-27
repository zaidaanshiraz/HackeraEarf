//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-path-with-jumps-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
 Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> ans=getMazePaths(1,1,n,m);
        System.out.print(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if(sr==dr&&sc==dc)
    {
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
    }
    ArrayList<String> ans=new ArrayList<>();
    for(int horijumps=1;horijumps<=dc-sc;horijumps++)
    {
        ArrayList<String> hpaths=getMazePaths(sr,sc+horijumps,dr,dc);
        for(String each:hpaths)
        {
            ans.add("h"+horijumps+each);
        }
    }
     for(int verijumps=1;verijumps<=dr-sr;verijumps++)
    {
        ArrayList<String> vpaths=getMazePaths(sr+verijumps,sc,dr,dc);
        for(String each:vpaths)
        {
            ans.add("v"+verijumps+each);
        }
    }
     for(int diagonaljump=1;diagonaljump<=dc-sc&&diagonaljump<=dr-sr;diagonaljump++)
    {
        ArrayList<String> dpaths=getMazePaths(sr+diagonaljump,sc+diagonaljump,dr,dc);
        for(String each:dpaths)
        {
            ans.add("d"+diagonaljump+each);
        }
    }
    return ans;
}

}
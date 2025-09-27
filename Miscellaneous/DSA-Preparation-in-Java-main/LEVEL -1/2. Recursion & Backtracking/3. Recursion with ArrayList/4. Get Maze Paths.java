//Ques->https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-paths-official/ojquestion

//Code->
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> obj=getMazePaths(1,1,n,m);
        System.out.println(obj);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
if(sr==dr && sc==dc)
{
    ArrayList<String> base=new ArrayList<>();
    base.add("");
    return base;
}
ArrayList<String> hpaths=new ArrayList<>();
ArrayList<String> vpaths=new ArrayList<>();
if(sc<dc){
hpaths=getMazePaths(sr,sc+1,dr,dc);}
 if(sr<dr){
vpaths=getMazePaths(sr+1,sc,dr,dc);
}

ArrayList<String> res=new ArrayList<>();
for(String val:hpaths)
res.add("h"+val);
for(String val:vpaths)
res.add("v"+val);

return res;


    }
    

}
//Introduction-->>>>>>>>ONLY CODE

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        HashMap<String,Integer> pmap=new HashMap<>();

        //1. add 
        pmap.put("India",130);
        pmap.put("China",200);
        pmap.put("Aus",50);
        pmap.put("Utopia",0);
        System.out.println(pmap);
        
//Output 
//{China=200, Utopia=0, Aus=50, India=130}

//2. Update
pmap.put("Aus",51);
   System.out.println(pmap);
//output->{China=200, Utopia=0, Aus=51, India=130}

//3. Get
int ipop=pmap.get("India");
System.out.println(ipop);
//Output->130 

//4.contains key
System.out.println(pmap.containsKey("US"));
pmap.put("US",40);
System.out.println(pmap.containsKey("US"));
//output->false
//        true

Set<String> keys=pmap.keySet();
for(String key:keys)
{
    System.out.println(key);
    System.out.println(pmap.get(key));
}
//Output->China
// 200
// Utopia
// 0
// Aus
// 51
// US
// 40
// India
// 130
pmap.remove("China");
System.out.println(pmap);

//Ouput ->{Utopia=0, Aus=51, US=40, India=130}
        
    }

}
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/longest-substring-with-at-most-k-unique-characters-official/ojquestion

import java.util.*;

public class Main {

	public static int solution(String s, int k) {
		// write your code here
	  HashMap<Character,Integer>hm=new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            int freq=hm.getOrDefault(s.charAt(i),0)+1;
            hm.put(s.charAt(i),freq);
            while(hm.size()>k)
            {
              int lfreq=hm.get(s.charAt(l));
                hm.put(s.charAt(l),lfreq-1);
                if(lfreq-1==0)
                hm.remove(s.charAt(l));
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;	
	//	return 0;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}

//https://www.spoj.com/submit/DEFKIN/id=29708324

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int length=scn.nextInt();
		int breadth=scn.nextInt();
		int tower=scn.nextInt();
		ArrayList<Integer> rows=new ArrayList<>();
		rows.add(0);
		rows.add(length+1);
		ArrayList<Integer> cols=new ArrayList<>();
		cols.add(0);
		cols.add(breadth+1);
		for(int i=0;i<tower;i++)
		{
			int row=scn.nextInt();
			int col=scn.nextInt();
			rows.add(row);
			rows.add(col);
		}
		Collections.sort(rows);
		Collections.sort(cols);
		int maxLength=0,maxBreadth=0;
		for(int i=1;i<rows.size();i++)
		{
			maxLength=Math.max(maxLength,rows.get(i)-rows.get(i-1)-1);
			maxBreadth=Math.max(maxBreadth,cols.get(i)-cols.get(i-1)-1);
		}
		System.out.println(maxLength*maxBreadth);
	}
}
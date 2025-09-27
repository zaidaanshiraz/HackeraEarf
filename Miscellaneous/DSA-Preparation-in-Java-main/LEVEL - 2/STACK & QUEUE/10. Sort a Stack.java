//https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275
import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer>  stack) {
		// Write your code here.
        if(stack.isEmpty()) return ;
        int top=stack.pop();
        sortStack(stack);
        insertAtSorted(stack,top);
	}
    public static void insertAtSorted(Stack<Integer> stack,int val)
    {
        if(stack.isEmpty()||stack.peek()<=val)
        {
            stack.push(val);
            return ;
        }
        int top=stack.pop();
        insertAtSorted(stack,val);
        stack.push(top);
    }

}
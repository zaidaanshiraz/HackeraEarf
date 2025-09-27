//Ques->https://leetcode.com/problems/ugly-number-ii/submissions/

//Code
class Solution {
    //O(N) Time, O(N) Space
    public int nthUglyNumber(int n) {
       if(n==1)
           return 1;
        //Pointers Pointing to Indices not values
        int ptr2=0,ptr3=0,ptr5=0;
ArrayList<Integer> ugly=new ArrayList<>();
        //visited array
    ugly.add(1); //to add the 1st ugly no at index 0
for(int i=1;i<n;i++)
{
    int a=ugly.get(ptr2)*2;
    int b=ugly.get(ptr3)*3;
    int c=ugly.get(ptr5)*5;
    int min=Math.min(a,Math.min(b,c));
    ugly.add(min);
    if(min==a) ptr2++;
    if(min==b) ptr3++;
    if(min==c) ptr5++;
    
}
        return ugly.get(n-1);
        
    }
}
//Code
public static MissingEleminAp(int []arr){
int low=0;
int high=n-1;
int commonDiff=(arr[n-1]-arr[0])/n;
while(low<=high)
{
    int high=low+(high-low)/2;
    int actualVal=arr[mid];
    int  expectedVal=arr[0]+commonDiff*mid;
    if(actualVal==expectedVal)
    {
        low=mid+1;
    
    }else
    {
        ans=expectedVal;
        high=mid-1;
    }
}return ans;
}
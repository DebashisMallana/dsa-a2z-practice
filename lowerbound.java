public class lowerbound
{
    // Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
    //The  lower bound algorithm finds the first or the smallest index in a sorted array 
    // where the value at that index is greater than or equal to a given key 
    //The lower bound is the smallest index, ind, where arr[ind] >= x
    //But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
    public int lb (int a[],int x)
    {
       int l=a.length;
        int start=0;
        int end=l-1;
        int res=l;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]==x)
                return (mid);
             else if(a[mid]<x)
        {
            end=mid-1;
        }
        else (a[mid]<x)
        {
            start=mid+1;
        }

     }  
     int first=0;
        int last=l-1;
        int res=l;
        while (first<=last) {       
        int center=(first+last)/2;
           

    }
    public static void main(String[] args) {
        
    }
}
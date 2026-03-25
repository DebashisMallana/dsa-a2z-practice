public class upperbound {
    // The upper bound algorithm finds the first or the smallest index in a sorted array
    //  where the value at that index is greater than the given key i.e. x.
    // The upper bound is the smallest index, ind, where arr[ind] > x.
    public void ub (int a[],int x)
    {
       int l=a.length;
        int start=0;
        int end=l-1;
        int ans=l;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>x)
            {
                System.out.println("The Upper bound of the key provided is "+mid);
            break;
            }
             else if(a[mid]<x)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
     }  
    }
}
    public static void main(String[] args) {
        upperbound ob= new upperbound();
        int arr[]={3,5,8,9,15,19};
        ob.ub(arr,9);
        
    }

    
}

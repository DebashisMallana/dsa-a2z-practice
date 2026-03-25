public class firstandlastoccurence{
    public int ub (int a[],int x)
    {
       int l=a.length;
        int start=0;
        int end=l-1;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>x)
            {
                return(mid);
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
public void lb (int a[],int key)
    { 
       int l=a.length;
        int start=0;
        int end=l-1; 
        int res=0;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>=key)
                {
                    res=mid;
            break;
                }
            else if(a[mid]<key)
        {
            start=mid+1;
        }
              else
        {
           end=mid-1;
        }
        }
        System.out.println("The element is found in the array in the index:"+res);
              
    }     
}
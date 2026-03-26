public class firstandlastoccurence{
    public int ub (int a[],int x)
    {
       int l=a.length;
        int start=0;
        int end=l-1;
        int ans=l;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>x)
            {
                ans=mid;
                end=mid-1;
            }
             
        else
        {           
             start=mid+1;
     }  
    }
    return (ans);
}
public int lb (int a[],int key)
    { 
       int l=a.length;
        int start=0;
        int end=l-1; 
        int ans=l;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>=key)
                {
                    ans=mid;
                    end=mid-1;
                }
              else
        {
           start=mid+1;
        }
        }
        return (ans);
              
    }     
    public static void main(String[] args) {
        firstandlastoccurence ob= new firstandlastoccurence();
        int arr[]={3,5,8,9,15,19};
       int k= ob.lb(arr,9);
        int k1=ob.ub(arr,9);
        System.out.println("The lowerbound is"+k);
        System.out.println("The upper bound is"+k1);
}
}
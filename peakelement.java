public class peakelement {
    public int peak(int a[])
    {
        int l=a.length;       
        int start=1;
        int end=l-2;
         if(l==1) return a[0];
        if(a[0]>a[1]) return a[0];
        if(a[l-1]>a[l-2]) return a[l-1];
       while (start <= end) {
        int mid = (start + end) / 2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]){
                return a[mid];
            }     
            
            else if (a[mid]<a[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }                     
    }
     return -1;
}
public static void main(String[] args) {
        int arr[]={1,2,3,1} ;
        peakelement ob= new peakelement();
        System.out.println(ob.peak(arr));
    }
    
   
}

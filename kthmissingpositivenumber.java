public class kthmissingpositivenumber
{
    static int findmissing(int a[], int k)
    {
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int missing=a[mid]-(mid+1);
            if(missing<=k) low=mid+1;
            else high=mid-1;
        }
        return k+high+1;
    }
     public static void main(String[] args) {
        int arr[]={4,7,9,10};
        int k=1;
        System.out.println(findmissing(arr,k));
        
    }
}
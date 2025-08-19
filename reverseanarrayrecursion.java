public class reverseanarrayrecursion {
    void reverseanarray(int a[],int i,int n)
    {
        if(i==(a.length/2))  return;
        else
        {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        reverseanarray(a, i+1,n);
    }
    public static void main(String[] args) {
        {
            reverseanarrayrecursion ob=new reverseanarrayrecursion();
            int arr[]={1,2,3,4,5,6,7,8,9};
            ob.reverseanarray(arr,0,arr.length);
            for(int j=0;j<arr.length;j++)
        System.out.print(arr[j]+" ");
        }
    }
    
}

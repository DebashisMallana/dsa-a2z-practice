public class nextpermutation {
    void permutation(int a[])
    { 
        int idx=-1;
        int n=a.length;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            reverse(a,0,n-1);
            return;
        }
        for(int j=n-1;j>idx;j--)
        {
            if(a[j]>a[idx])
            {
                int temp=a[j];
                a[j]=a[idx];
                a[idx]=temp;
                break;
            }
        }
        reverse(a,idx+1,n-1);
        
    }
    void reverse(int a[],int start,int end)
    {
        int n=a.length;
        while(start<=end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        nextpermutation ob =new nextpermutation();
        int b[]={1,2,3};
        ob.permutation(b);
        for(int z=0;z<b.length; z++)
        {
            System.out.print(b[z]+" ");
        }

    }
}

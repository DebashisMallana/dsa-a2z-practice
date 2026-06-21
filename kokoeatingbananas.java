public class kokoeatingbananas {
    public int sumoftime(int a[],int m)
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
             s=s+(a[i]%m);
        }
        return s;
    }
    public int bananas(int n,int a[] , int h)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,a[i]);
        }
        int start=1,end=max;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(sumoftime(a,mid)==h)
                return mid;
            else if (sumoftime(a, mid)<h)
                start=mid+1;
            else 
                end=mid-1;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        kokoeatingbananas obj = new kokoeatingbananas();
        int arr[]={7, 15, 6, 3};
        int n = 4;
        int h=8;
        System.out.println(obj.bananas(n,arr,h));
        System.out.println((int)7%8);
    }
}
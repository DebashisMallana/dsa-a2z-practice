public class kokoeatingbananas {
    public int sumoftime(int a[],int m)
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
             s=s+(int) (Math.ceil(((double)a[i]/m)));
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
        int ans=max;
        int start=1,end=max;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(sumoftime(a,mid)<=h)
            {
                ans=mid;
                end=mid-1;
            }
                
            else 
                start=mid+1;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        kokoeatingbananas obj = new kokoeatingbananas();
        int arr[]={25, 12, 8, 14, 19};
        int n = 5;
        int h=5;
        System.out.println(obj.bananas(n,arr,h));
    }
}
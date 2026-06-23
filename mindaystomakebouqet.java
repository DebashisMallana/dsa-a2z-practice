public class mindaystomakebouqet
{
    int blossom(int d,int a[],int k)
    {
        int consecutive=0;
        int bouquet=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]<=d)
            ++consecutive;
        else
        {
            bouquet+=consecutive/k;
            consecutive=0;
        }
            
        
        }     
        return bouquet;
    }
    int days(int n,int a[],int m, int k)
    {
         if(n<m*k)
            return -1;
        int max=0;       
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,a[i]);
        }
       int start=1,end=max,ans=-1;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        if(blossom(mid,a,k)<=m)
        {
           ans=mid;
        start=mid+1;
        }
            else                
         end=mid-1;
       }
       return ans;       
    }
    public static void main(String[] args) {
        mindaystomakebouqet obj = new mindaystomakebouqet();
        int arr[]={7,7,7,7,13,11,12,7};
        int n = 8;
        int m=2;
        int k=3;
        System.out.println(obj.days(n,arr,m,k));
    }
}
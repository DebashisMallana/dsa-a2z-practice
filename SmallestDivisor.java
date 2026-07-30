public class SmallestDivisor
{
    int sumofdivisor(int d,int a[])
    {
       int s=0;
       for(int i:a)
       {
        s += (int) Math.ceil((double) i / d);
       }
       return s;
    }
    int days(int a[],int limit)
    {
        int max=0;       
        for(int i:a)
        {
            max=Math.max(max,i);
        }

       int start=1,end=max,ans=-1;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        if(sumofdivisor(mid,a)<=limit)
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
       SmallestDivisor obj = new SmallestDivisor();
        int arr[]={1,2,3,4,5};
        int limit = 8;
        System.out.println(obj.days(arr,limit));
    }
}
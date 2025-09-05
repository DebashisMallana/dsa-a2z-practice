    public class maxsubarraysum {
    public void subarray(int a[])
    {
        int i=0,max_start=0,max_end=0,start=0,max=a[0];;
        int sum=0;
        for(i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum>max)
            {
                max=sum;
                max_start=start;
                max_end=i;
            }
            if(sum<0)
            {
                sum=0;
                start=i+1;
            }
        }
        for(int k=max_start;k<=max_end;k++)
        {
            System.out.print(a[k]+" ");
            
        }
        System.out.println("and the maximum subarray sum is"+" "+max);
    }
    public static void main(String[] args) {
        {
            maxsubarraysum ob= new maxsubarraysum();
            int b[]={-2,1,-3,4,1,2,-1,5,-4};
            ob.subarray(b);
        }
    }
    
}

    


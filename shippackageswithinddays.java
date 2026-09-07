public class shippackageswithinddays {
   int dayscalculator(int capacity,int a[])
   {
    int days=1;
    int total_weights=0;;
    for(int i=0;i<a.length;i++)
    {
        if(total_weights+a[i]<=capacity)
        {
           total_weights+=a[i];
        }
        else
        {
            days+=1;
            total_weights=a[i];
        }
    }
    return days;
   }
   int checkdays(int a[],int d)
   {
        int max=0;   
        int sum=0;    
        for(int i:a)
        {
            max=Math.max(max,i);
        }
        for(int i:a)
        {
            sum+=i;
        }
       int start=max,end=sum;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        if(dayscalculator(mid,a)<=d)
        {  
            end=mid-1;          
        }
            else                
         start=mid+1;
       }
       return start;       
    }
   
    public static void main(String[] args) {
       shippackageswithinddays obj = new shippackageswithinddays();
        int arr[]={5, 4, 5, 2, 3, 4, 5, 6};
        int days = 5;
        System.out.println(obj.checkdays(arr,days));
    }
}
    

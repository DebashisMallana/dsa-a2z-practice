public class kthmissingpositivenumber
{
    int checkdays(int a[],int d)
   {
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
        int arr[]={4,7,9,10};
        int k=4;
        System.out.println(print(arr,k));
        
    }
}
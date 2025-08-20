//implementing merge sort 
public class implementingmergesort
{
    //The core logic of the merge sort is for divide and conquer, in simple  language we have to divide the array into two halves and the halves are divided until they have a singular element left and then the merge function is called which compares both the halves and stores in an another sorted array
    public void   merge(int arr[],int start, int mid,int end)
    {
      int sortarr[]=new int[end-start+1];
      int i=start,j=mid+1,k=0;
      while(i<=mid && j<=end)
      {
        if(arr[i]>arr[j])
        {
         sortarr[k]=arr[j];
        j++;
        }        
        else
        {
         sortarr[k]=arr[i];
        i++;
        }
       k++;
    }
    while(i<=mid)
    {
        sortarr[k]=arr[i];
        i++;
        k++;
    }while(j<=end)
    {
        sortarr[k]=arr[j];
        j++;
        k++;
    }
    for(int x=0;x<sortarr.length;x++)
    {
       arr[start+x]=sortarr[x];
    }
   }
    public void mergesort(int arr[],int start,int end)
    {
       int mid;
      if(start>=end)  return ;
       else
    {
         mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid, end);
    }
}
public static void main(String[] args) {
        implementingmergesort ob=new implementingmergesort();
        int b[]={9,7,0,6,5,9,78,98,67,87,56,43,23,1,2,3,6,8,0,7,5,3,267,789,0};
        ob.mergesort(b,0,b.length-1);
        for(int num : b) {
            System.out.print(num + " ");
        }
    }
}

   
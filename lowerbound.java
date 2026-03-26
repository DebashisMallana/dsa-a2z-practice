public class lowerbound
{
    // Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
    //The  lower bound algorithm finds the first or the smallest index in a sorted array 
    // where the value at that index is greater than or equal to a given key 
    //The lower bound is the smallest index, ind, where arr[ind] >= x
    //But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
    public void lb (int a[],int key)
    { 
       int l=a.length;
        int start=0;
        int end=l-1; 
        int ans=l;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>=key)
                {
                    ans=mid;
                    end=mid-1;
                }
              else
        {
           start=mid+1;
        }
        }
        System.out.println("The element is found in the array in the index:"+ans);
              
    }     

      public static void main(String[] args) {
        lowerbound ob =new lowerbound();
        int arr[]={3,5,8,15,19};
        ob.lb(arr,9);
      }
    }
       
  
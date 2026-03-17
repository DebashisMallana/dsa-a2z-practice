public class firstoccurence {
    //Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key.
    //  If the target is not found then return -1. Note: Consider 0 based indexing 
    void fo(int a[],int key)
    {
        int l=a.length;
        int start=0;
        int end=l-1;
        int fo1=-1;
        while (start<=end) {       
        int mid=(start+end)/2;
        if(a[mid]==key)
                {
                 fo1=mid;              
                } 
              else if( a[mid]<key)
        {
           start=mid+1;  
        }  
        else{
            end=mid-1;  
        }
        }  
        System.out.println("The last occurence of the element "+key+" is" +fo1);
    }    

      public static void main(String[] args) {
       firstoccurence ob =new firstoccurence();
        int arr[]={3, 4, 13, 13, 13, 20, 40} ;
        //ob.lo(arr,13);
        ob.fo(arr,13);
      }
    }



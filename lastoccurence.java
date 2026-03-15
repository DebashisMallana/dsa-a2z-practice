public class lastoccurence {
    //Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key.
    //  If the target is not found then return -1. Note: Consider 0 based indexing
    
    void fo(int a[],int key)
    {
        int l=a.length;
        int start=0;
        int end=l-1;
        while (start<=end) {       
        int mid=(start+end)/2;
        if(a[mid]==key)
                {
                  System.out.println("The first occurence of the element "+key+" is" +mid);
                  break;
                } 
              else if( a[mid]<key)
        {
           start=mid+1;
        }  
        else{
            end=mid-1;    
        }
        }  
       
    }    

      public static void main(String[] args) {
       lastoccurence ob =new lastoccurence();
        int arr[]={3, 4, 13, 13, 13, 20, 40} ;
        //ob.lo(arr,13);
        ob.fo(arr,13);
      }
    }



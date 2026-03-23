public class firstandlastposition {
    void lo(int a[], int key)
    {
         int l=a.length;
        int start=0;
        int end=l-1;
        int ;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]==key)
                {
                    res=mid;
                }
            else if(a[mid]<key)
        {
            start=mid+1;
        }
              else
        {
           end=mid-1;
        }
        }
        System.out.println("The element is found in the array in the index:"+res);
        }
              
    }     
      public static void main(String[] args) {
        firstandlastposition ob =new firstandlastposition();
        int arr[]={5,7,7,8,8,10};
        ob.lo(arr,8);
      }
    }


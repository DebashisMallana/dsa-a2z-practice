public class lastoccurence {
    void lo(int a[], int key)
    {
        int l=a.length;
        int start=l-1;
        int end=0;
        while (end<=start) {       
        int mid=(start+end)/2;
            if(a[mid]==key)
                {
                        System.out.println("The last occurence of the element"+key+"is"+mid);
                        break;
                }
            else if(a[mid]<key)
        {
            end=mid+1;;
        }
              else
        {
           start=mid-1;
        }
        }
              
    }     
      public static void main(String[] args) {
        lastoccurence ob =new lastoccurence();
        int arr[]={3, 4, 13, 13, 13, 20, 40};
        ob.lo(arr,13);
      }
    }


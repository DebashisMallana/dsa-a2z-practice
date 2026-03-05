//Day 1 of writing a single line of code i.e 08/02/2026
public class binarysearch {
    void search(int a[], int key)// day 2 of writing a single line of code i.e 09/02/2026
    {
        //day 3 of writing a single line of code (10/02/2026)
        int l=a.length;
        int start=0;//day 5 (12/02/2026)
        int end=l-1;//day 6 (13/02/2026)
        int res=0;
        while (start<=end) {       
        int mid=(start+end)/2;//day 8(15/2/2026)
            if(a[mid]==key)
                {// day 9(16/02/2026)
                System.out.println("The element is found in the array in the index:"+mid);//day 10(17/02/2026)
            break;
                }
            else if(a[mid]<key)//day 11(18/02/2026)
        {
            end=mid-1;//day 12(19/02/2026)
        }
              else
        {
            start=mid+1;//day 14(21/02/2026)
        }
        }
              for(int i=0;i<l;i++)
              {
                if(a[i]>key)
                 res=i;
                break;
            }
            System.out.println(res);
    }     

      public static void main(String[] args) {
        binarysearch ob =new binarysearch();
        int arr[]={3,5,8,15,19};
        ob.search(arr,9);
      }
    }

    


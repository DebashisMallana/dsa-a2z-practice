public class searchinsertposition{
    //You are given a sorted array arr of distinct values and a target value x. 
    // You need to search for the index of the target value in the array.
    public void pos(int a[], int key){
        int l=a.length;
        int start=0;
        int end=l-1;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>key)
                {
             System.out.println("The element"+key+"can be inserted in the index:"+mid);
            break;
                }
                else if(a[mid]==key)
                {
                    System.out.println("The element"+key+"is already present in the array in the index:"+mid);
            break; 
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
    }     

      public static void main(String[] args) {
       searchinsertposition ob =new searchinsertposition();
        int arr[]={1,2,4,7};
        ob.pos(arr,2);
      }
    }
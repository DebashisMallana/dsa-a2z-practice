public class floorceil{
    //you're given an sorted array arr of n integers and an integer x. 
    // Find the floor and ceiling of x in arr[0..n-1]. 
    // The floor of x is the largest element in the array which is smaller than or equal to x. 
    // The ceiling of x is the smallest element in the array greater than or equal to x
    public void fc(int a[], int key){
        int l=a.length;
        int start=0;
        int end=l-1;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>=key)
                {
             System.out.println("The ceil of the "+key+"is "+a[mid]);
            break;
                }
                else if(a[mid]<key)
                {
                    System.out.println("The floor of the "+key+"is "+a[mid]);
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
       floorceil ob =new floorceil();
        int arr[]={3, 4, 4, 7, 8, 10};
        ob.fc(arr,5);
      }
    }

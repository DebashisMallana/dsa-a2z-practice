public class floorceil{
    //you're given an sorted array arr of n integers and an integer x. 
    // Find the floor and ceiling of x in arr[0..n-1]. 
    // The floor of x is the largest element in the array which is smaller than or equal to x. 
    // The ceiling of x is the smallest element in the array greater than or equal to x
    public void floor(int a[], int key){
        int l=a.length;
        int start=0;
        int end=l-1;
        int f=-1;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]<=key)
                {
                  f=a[mid];
                  start++;
                } 
              else
        {
           end=mid-1;
        }      
        }  
        System.out.println("The floor of the element "+key+" is"+f);
    }
    public void ceil (int a[],int key){
        int l=a.length;
        int start=0;
        int end=l-1;
        int c=-1;
        while (start<=end) {       
        int mid=(start+end)/2;
            if(a[mid]>=key)
                {
                  c=a[mid];
                  end--;
                } 
            else 
        {
            start=mid+1;
        }
        }  
        System.out.println("The ceil of the element "+key+" is"+c);
        
    }

      public static void main(String[] args) {
       floorceil ob =new floorceil();
        int arr[]={3, 4, 4, 7, 8, 10};
        ob.floor(arr,8);
        ob.ceil(arr,8);
      }
    }

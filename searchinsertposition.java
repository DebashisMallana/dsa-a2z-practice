public class searchinsertposition{
    //You are given a sorted array arr of distinct values and a target value x. 
    // You need to search for the index of the target value in the array.
    public static int searchInsert(int[] a, int target) {
         int l=a.length;
         if(a[l-1]<target) return l;
         if(a[0]>target) return 0;
         int low=0;
         int high=l-1;
         while(low<=high)
         {
            int mid=low+(high-low)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]>target) high=mid-1;
            else if(a[mid]<target) low=mid+1;           
         }
         return low;
    }

      public static void main(String[] args) {
       searchinsertposition ob =new searchinsertposition();
        int arr[]={1,2,4,7};
        System.out.println(searchInsert(arr,2));
      }
    }
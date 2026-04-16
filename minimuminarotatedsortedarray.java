public class minimuminarotatedsortedarray {
   public void minimum(int a[]) {
    int start = 0;
    int end = a.length - 1;
    int mini=Integer.MAX_VALUE;
    while (start <= end) {
        int mid = (start + end) / 2;

        // left  half sorted 
        if (a[start] <= a[mid]) {
            if(a[start]<mini)
                    mini=a[start];
                start=mid+1; 
            }     
            else{
            if(a[mid]<mini)
             mini=a[mid];
                end=mid-1;
        }     
    }
     System.out.println(mini);
}
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        minimuminarotatedsortedarray ob =new minimuminarotatedsortedarray();
        ob.minimum(arr);
    }
}
    

public class timesarrayisrotated {
    public void find(int a[])
    {
        int l=a.length;       
        int start=0;
        int end=l-1;
        int mini=Integer.MAX_VALUE;
        int miniindex=-1;
       while (start <= end) {
        int mid = (start + end) / 2;

        // left  half sorted 
        if (a[start] <= a[mid]) {
            if(a[start]<mini){
                    mini=a[start];
                    miniindex=start;
            }
                start=mid+1; 
            }     
            else{
            if(a[mid]<mini){
                mini=a[mid];
                miniindex=mid;
            }
                end=mid-1;
        }     
    }
     System.out.println("The array is rotated "+miniindex+" times");
}

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        timesarrayisrotated ob =new timesarrayisrotated();
        ob.find(arr);
    }
    
}


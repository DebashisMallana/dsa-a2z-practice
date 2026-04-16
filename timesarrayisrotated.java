public class timesarrayisrotated {
    public void find(int a[],int key)
    {
        int l=a.length;       
        int start=0;
        int end=l-1;
        while(start<=end){
            int mid=(start+end)/2;
            }
           if(a[start]<=a[mid])//check if the left half is sorted
           {
           }
           
           else
           {
           }
        System.out.println("-1");

    }
    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        timesarrayisrotated ob =new timesarrayisrotated();
        ob.find(arr,1);
    }
    
}


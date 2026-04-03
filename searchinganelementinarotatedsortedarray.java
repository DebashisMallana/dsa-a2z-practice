public class searchinganelementinarotatedsortedarray {
    public void search(int a[],int key){
        int l=a.length;       
        int start=0;
        int end=l-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                System.out.println("the key is at"+mid);
            return;
            }
           if(a[start]<=a[mid])//check if the left half is sorted
           {
            if(a[start]<=key && key<=a[mid])
                end=mid-1;
            else
                start=mid+1;
           }
           else
           {
             if(a[mid]<=key && key<=a[end]) // checking if the element is present in the right half
                 start=mid+1;
            else              
            end=mid-1;
           }    
        }      
        System.out.println("-1");

    }
    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        searchinganelementinarotatedsortedarray ob= new searchinganelementinarotatedsortedarray();
        ob.search(arr,1);
    }
    
}

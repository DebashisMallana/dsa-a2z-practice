public class searchinganelementinarotatedsortedarray {
    public void search(int a[],int key){
        int l=a.length;
        int i=1;
        while(a[i-1]<a[i]){
             i++;
        }
        int start=0;
        int end=i;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                System.out.println("the key is at"+mid);
            return;
            }
            else if (a[mid]>key)
                end=mid-1;
            else
                start=mid+1;

        }
        int first=i;
        int last=l-1;
         while(first<=last){
            int mid=(first+last)/2;
            if(a[mid]==key){
                    System.out.println("the key is at"+mid);
            return ; }
            else if (a[mid]>key)
            last=mid-1;
            else
                first=mid+1;

        }
        System.out.println("-1");

    }
    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        searchinganelementinarotatedsortedarray ob= new searchinganelementinarotatedsortedarray();
        ob.search(arr,3);
    }
    
}

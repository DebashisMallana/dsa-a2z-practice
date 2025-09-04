
public class sortarrayof0s1s2s {
    void sort(int a[])
    {
        int low=0,mid=0,high=a.length-1,temp=0;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
             temp=a[mid];
            a[mid]=a[low];
            a[low]=temp;;
            low++;
            mid++;
            }
            else if(a[mid]==2)
            {
                int temp1=a[high];
                a[high]=a[mid];
                a[mid]=temp1;
                high--;
            } 
            else { 
                 mid++;
                 }  
            
            }
    }

    public static void main(String[] args) {
        sortarrayof0s1s2s ob = new sortarrayof0s1s2s();
        int b[]={2,0,2,1,1,0,1,0,2,1,0,2,2,1,1,1,0,0,0,0,0,1,2,1,2,1};
        ob.sort(b);
        for (int num = 0; num < b.length; num++) {
        System.out.print(b[num] + " ");
    }
    }
    
}

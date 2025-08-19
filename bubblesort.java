public class bubblesort {
    public static void main(String[] args) {
    // We will implement the bubble sort in java here, the core logic of the bubble sort is to swap the adjancent values till we make the largest element to  reach the end of the array and the smallest element at the beginning of the array
    int a[]={1,9,2,8,3,7,4,6,5,5,0,19,23,28,21};
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length-i-1;j++)
        {
          
         if (a[j] > a[j+1]) 
         {
         int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
        }
       }
    }
    for(int j=0;j<a.length;j++)
    System.out.print(a[j]+" ");
}
}


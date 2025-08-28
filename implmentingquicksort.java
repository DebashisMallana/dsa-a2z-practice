public class implmentingquicksort {
    public int  partition(int a[],int low,int high)
    { 
      int i=low;
      int j=high;
      int pivot=a[low];
      while(i<j)
      {
      while(i<high && a[i]<=pivot) { i++ ;}
      while(j>low && a[j]>pivot) {j--; }
      if(i<j)
      {
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      }      
      } 
      int temp=a[low];
      a[low]=a[j];
      a[j]=temp;  
      return(j);            
    }
    public void quicksort(int a[],int start, int end)
    {
        if(start<end)
        {
            int p=partition(a, start, end);
            quicksort(a,start,p-1);
            quicksort(a,p+1,end);
        }
    }    
   
    public static void main(String[] args) {
        implmentingquicksort ob =new implmentingquicksort();
        int b[] = {9, 7, 0, 6, 5, 9, 78, 98, 67, 87, 56, 43,0,56,97,97,9,8,5, 23, 1, 2, 3, 6, 8, 0, 7, 5, 3, 267, 789, 0,50,502,9810,614,874,203,89,763,753,1397,637,7887,889};
         ob.quicksort(b,0,b.length-1);
        for (int num = 0; num < b.length; num++) {
            System.out.print(b[num] + " ");
        }
    }
}

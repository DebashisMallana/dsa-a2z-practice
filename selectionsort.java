public class selectionsort {
    public static void main(String[] args) {
    // We will implement the selection sort in java here, the core logic of selection sort is to find the minimum element in a given subarray or a range of elements in the array and to swap it with the first value of the subarray as:
    int a[]={1,9,2,8,3,7,4,6,5,5,0,19,23,28,21};
    //start with considering a pointer which will traverse through the loop as;
    //consider minele for the minimum element
    for(int i=0;i<a.length-1;i++)
    {
        int minele=i;
        // now to findout the minimum element;
        for(int j=i+1;j<a.length;j++)
        {
            if (a[j] < a[minele]) {
             minele = j;  // store index
       }
       }
        int temp=a[i];
        a[i]=a[minele];
        a[minele]=temp;
    }
    for(int j=0;j<a.length;j++)
    System.out.print(a[j]+" ");
}
}

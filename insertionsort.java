public class insertionsort {
    public static void main(String[] args) {
    //We will implement the insertion sort here
    int a[]={1,9,2,8,3,7,4,6,5,5,0,19,23,28,21};
    //The core logic is to consider an element and to swap each element smaller to it.The element to be swapped should be present before the element we are considering
    for(int i=1;i<=a.length-1;i++)
    {
        int ele=i;//Start a loop and consider the index as i (the current element)
        while(ele>0 && a[ele]<a[ele-1])//we will decrease ele till it becomes o and also check if the current element is greater than the previous elements if it is ok otherwise swap
        {
        int temp=a[ele];
        a[ele]=a[ele-1];
        a[ele-1]=temp;
        ele--;
        }
    }        
    for(int j=0;j<a.length;j++)
    System.out.print(a[j]+" ");
}
}

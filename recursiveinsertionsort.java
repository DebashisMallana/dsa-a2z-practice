public class recursiveinsertionsort {
    public void insertionsort(int a[],int l)
    {
     if(l<=1)  return;
     else
     {
        insertionsort(a,l-1);
        int key=a[l-1];
        int j=l-2;
        while(j>=0 && key<a[j] )
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
     }
    }
    public static void main(String[] args) {
        recursiveinsertionsort ob = new recursiveinsertionsort();
        int b[] = {9, 7, 0, 6, 5, 9, 78, 98, 67, 87, 56, 43,0,56,97,97,9,8,05, 23, 1, 2, 3, 6, 8, 0, 7, 5, 3, 267, 789, 0};
         ob.insertionsort(b, b.length);
        for (int num = 0; num < b.length; num++) {
            System.out.print(b[num] + " ");
        }
    }
}


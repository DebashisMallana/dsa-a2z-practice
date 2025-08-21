public class recursivebubblesort {
    public void bubblesort(int a[], int l, int i,int j) {
       if(i==l-1) return ;
       if(j<l-i-1)  
       {
        if(a[j]>a[j+1])
        {
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
       }
       bubblesort(a, l, i,j+1);
    }
    else
    bubblesort(a, l, i+1,0);
    }
    public static void main(String[] args) {
        recursivebubblesort ob = new recursivebubblesort();
        int b[] = {9, 7, 0, 6, 5, 9, 78, 98, 67, 87, 56, 43, 23, 1, 2, 3, 6, 8, 0, 7, 5, 3, 267, 789, 0};
         ob.bubblesort(b, b.length, 0,0);
        for (int num = 0; num < b.length; num++) {
            System.out.print(b[num] + " ");
        }
    }
}

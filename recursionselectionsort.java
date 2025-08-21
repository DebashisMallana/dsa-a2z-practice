public class recursionselectionsort {
    public void selectionsort(int a[], int l, int i,int j,int minindex) {
       if(i==l) return ;
       if(j<l)  
       {
        minindex=a[j]<a[minindex]?j:minindex;
        selectionsort(a, l, i,j+1,minindex);
       }      
       else
       {
        int temp=a[i];
        a[i]=a[minindex];
        a[minindex]=temp;
        selectionsort(a, l, i+1,i+1,i+1);
       }
    }
    public static void main(String[] args) {
        recursionselectionsort ob = new recursionselectionsort();
        int b[] = {9, 7, 0, 6, 5, 9, 78, 98, 67, 87, 56, 43,0,56,97,97,9,8,05, 23, 1, 2, 3, 6, 8, 0, 7, 5, 3, 267, 789, 0};
         ob.selectionsort(b, b.length, 0,1,0);
        for (int num = 0; num < b.length; num++) {
            System.out.print(b[num] + " ");
        }
    }
}


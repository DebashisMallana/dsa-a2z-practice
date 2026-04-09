public class searchinginarotatedsortedarraysecondpart {
   public void search(int a[], int key) {
    int start = 0;
    int end = a.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (a[mid] == key) {
            System.out.println("true");
            return;
        }
        // Handle duplicates
        if (a[start] == a[mid] && a[mid] == a[end]) {
            start++;
            end--;
        }
        // Left half sorted
        else if (a[start] <= a[mid]) {
            if (a[start] <= key && key < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Right half sorted
        else {
            if (a[mid] < key && key <= a[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    System.out.println("false");
}

    public static void main(String[] args) {
        int arr[]={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        searchinginarotatedsortedarraysecondpart ob= new searchinginarotatedsortedarraysecondpart();
        ob.search(arr,3);
    }
}
    



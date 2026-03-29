public class countingelementsinasortedarray{
    public int ub(int a[], int x) {
        int l = a.length;
        int start = 0;
        int end = l - 1;
        int ans = l;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] > x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public int lb(int a[], int key) {
        int l = a.length;
        int start = 0;
        int end = l - 1;
        int ans = l;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] >= key) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        countingelementsinasortedarray ob =new countingelementsinasortedarray();
        int arr[]={1, 1, 2, 2, 2, 2, 2, 3};
        int key=2;
        int k2=ob.ub(arr,key);
        int k1=ob.lb(arr,key);
        int res=k2-k1;
        System.out.println("The number of times" + key+ "is occuring in the array is " +res);
    }
}
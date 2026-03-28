class Solution {
    public int[] searchRange(int arr[], int key) {  // ✅ renamed
        int k1 = lb(arr, key);
        int k2 = ub(arr, key);
        int res[] = new int[2];

        if (k1 == arr.length || arr[k1]!=key) {
            k1 = -1;
            k2 = -1;
        }

        res[0] = k1;
        res[1] = k2;
        

        return res;
    }

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
        Solution sol = new Solution();

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int key = 2;

        int[] result = sol.searchRange(arr, key);

        System.out.println("First index: " + result[0]);
        System.out.println("Second index: " + result[1]);
}
}
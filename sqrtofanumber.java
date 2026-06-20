public class sqrtofanumber {

    int floorSqrt(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;   
    }

    public static void main(String[] args) {
        sqrtofanumber obj = new sqrtofanumber();
        int n = 28;
        System.out.println(obj.floorSqrt(n));
    }
}
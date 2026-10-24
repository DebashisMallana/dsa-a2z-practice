public class contest3med {
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long c = 0;
        int subarraylength = 0;
        int j = 0;

        while (j < nums.length) {
            while (j < nums.length &&
                   nums[j] >= minK && nums[j] <= maxK) {
                subarraylength++;
                j++;
            }

            c += (long) subarraylength * (subarraylength + 1) / 2;
            subarraylength = 0;

            if (j < nums.length) {
                j++;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1};
        int minK = 1;
        int maxK = 1;

        System.out.println(countSubarrays(arr, minK, maxK));
    }
}
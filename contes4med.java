import java.util.*;
public class contes4med {
    static PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
    public static void calculategain(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            Character[] arr = new Character[str.length()];
            for (int j = 0; j < str.length(); j++) {
                arr[j] = str.charAt(j);
            }
            Arrays.sort(arr, Collections.reverseOrder());
            StringBuilder result = new StringBuilder();
            for (char c : arr) {
                result.append(c);
            }
            int rearranged = Integer.parseInt(result.toString());
            int gain = rearranged-nums[i];
            if(gain>=0) pq.offer(gain);        
        }
    }

    public static long maximizeSum(int[] nums, int k) {
        pq.clear();
        calculategain(nums);
        long maxsum = 0;
        for(int i=0;i<nums.length;i++) maxsum+=nums[i];
        for (int i = 0; i < k; i++) {
            int gain = pq.poll();
            maxsum += gain;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {7,5,1};
        int k = 3;

        System.out.println(maximizeSum(arr, k));
    }
}

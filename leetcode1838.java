import java.util.Arrays;
public class leetcode1838 {         
     public int maxFrequency(int[] nums, int k) {
         // first lets sort the array  using built in function
        Arrays.sort(nums);
        // consider two pointers left and right now the logic is to first use a sorted array and then take two pointers for sliding window and our work is to check the left most elements when they are incremented are they equal to the right most element it is done by the part in which the current_sum is calculated , then the length of the window calculated by left-right+1 where right is the loop which runs from 0 to the array length and left is the sliding part which eliminates the element if the freq is more than the operations , now what we have considered is tofirst check the cost of making a smaller element to larger is the cost is less than k then fine otherwise eliminate the element  now the cost is calculated as the [window_length]*the rightmost element(the element everyone wanna be)-current_sum to see how much is the cost we need , think of it as i have 4 rs and someone has 6 so i need 2 more and i calulcate it by 6-4 the required goal-the current having;
        int left=0,right=0;        
        long current_sum=0L;
        int max_freq=0;
        for(right=0;right<nums.length;right++)
        {
            current_sum=current_sum+nums[right];
             while((long)(right-left+1)*nums[right]-current_sum>k)
            {
                current_sum=current_sum-nums[left];
                left++;
            }
            max_freq=Math.max(right-left+1,max_freq);
        }
        return(max_freq);
        }
        
        public static void main(String[] args) {
            leetcode1838 ob=new leetcode1838();
            int arr[]={9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966};
            int k1=ob.maxFrequency(arr,3056);
            System.out.println(k1);
        }        
    }
    


public class contest3 {
    public static  int peakValleyDifference(int[] nums) {
        int l=nums.length;
        int prevele,nextele;
        int sumofpeak=0;
        int sumofvalleys=0;
        
        for(int i=1;i<=l-2;i++)
        {
            prevele=i-1;
            nextele=i+1;
            if ((nums[i]>nums[prevele] && nums[i]>nums[nextele])) 
            {
                sumofpeak+=nums[i];
            }
            if ((nums[i]<nums[prevele] && nums[i]<nums[nextele]))
            {
                sumofvalleys+=nums[i];
            }
            
        }
        System.out.println(sumofpeak);
        System.out.println(sumofvalleys);
        return sumofpeak-sumofvalleys;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,4,1,3,0};
        System.out.println(peakValleyDifference(arr));
    }
}

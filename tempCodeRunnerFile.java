public class contest3med {
     public static long countSubarrays(int[] nums, int minK, int maxK) {
        long c=0;
        int l=nums.length;
        int i;
        int j=0;
        int subarraylength=0;
        for(i=0;i<l;i++)
        {
            while(j<l && nums[j]>=minK && nums[j]<=maxK)
            {
                j++;
                subarraylength++;
            }
            c+=subarraylength*(subarraylength+1)/2;
            subarraylength=0;
            j++;
        }
        return c;    
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,3};
        int minK=1;
        int maxK=5;
        System.out.println(countSubarrays(arr,minK,maxK));
    }
}

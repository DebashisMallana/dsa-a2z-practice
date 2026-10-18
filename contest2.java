public class contest2 {        
 public static int minDeletions(int[] nums) {
        int del=0;
        int l=nums.length;
        if(l==1) return 0;
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]==nums[i+1]) del++;
        }
        return del;
    }
 public static void main(String[] args) {
    int arr[]={4,4,9,4};
    System.out.print(minDeletions(arr));
}
}


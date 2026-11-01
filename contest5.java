public class contest5 {
     public static int minMergedInteger(int[] nums) {
        int l=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l-1;i++)
        {
            if(i%2==0)
            {
                int result = Integer.parseInt("" + nums[i] + nums[i+1]);
                min=Math.min(min,result);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[]={9,20};
        System.out.println(minMergedInteger(arr));
    }
}
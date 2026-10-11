public class contest1
{
public static int[] maxProductPair(int[] nums, int target) {
        int l=nums.length;
        int max=Integer.MIN_VALUE;
        int res[]={-1,-1};
       for(int i=0;i<l;i++)
       {
        for(int j=i+1;j<l;j++)
        {
           if(nums[i]+nums[j]==target && nums[i]>nums[j])
           {
                if(nums[i]*nums[j]>max)
                {
                        max=nums[i]*nums[j];
                        res[0]=i;
                        res[1]=j;
                }
           }
        }
}
        return res;
}
public static void main(String[] args) {
    int a[]={1,2,3,4};
    int target=5;
    int k[]=maxProductPair(a, target);
    for(int i:k)
    System.out.print(i+" ");
}
}
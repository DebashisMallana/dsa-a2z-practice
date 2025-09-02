public class rotaterightktimes {
    void reverse(int[] nums, int start , int end)
    {
        while(start<end)
        {
            int c=nums[start];
            nums[start]=nums[end];
            nums[end]=c;
            start++;
            end--;
        }
        }
        void rotate(int [] nums,int k)
        {
            k=k%nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
        public static void main(String[] args) {
            rotaterightktimes ob=new rotaterightktimes();
            int b[]={1,2,3,4,5};
            ob.rotate(b,1);
            for(int z=0;z<b.length;z++)
            System.out.print(b[z]+" ");
        }          
}

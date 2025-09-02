void reverse(int[] nums, int k) {
        int i=0;
        while(i<=k/2)
        {
            int c=nums[i];
            nums[i]=nums[k-1];
            nums[k-1]=c;
        }
        }
    }
        void rotate(int [] nums,int k)
        {
            reverse(nums,nums.length);
            reverse(nums,k);
            reverse(nums,nums.length-k);
        }
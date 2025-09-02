public class movezeroestotheendofthearray {
    public void moveZeroes(int[] nums) {
    int n=nums.length;
    int insertposition=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]!=0)
        {
        nums[insertposition]=nums[i];
        insertposition++;
        }
    }
    for(int i=insertposition;i<n;i++)
    {
        nums[i]=0;
    }
}
    public static void main(String[] args) {
        movezeroestotheendofthearray ob= new movezeroestotheendofthearray();
        int b[]={0, 1, 4, 0, 5, 2};
        ob.moveZeroes(b);
        for (int num = 0; num < b.length; num++) {
        System.out.print(b[num] + " ");
    }
}
    
}

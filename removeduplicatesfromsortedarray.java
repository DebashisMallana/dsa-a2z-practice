public class removeduplicatesfromsortedarray
{
         public int removeDuplicates(int[] nums) {
        int l = nums.length;
        if (l == 1) return 1;

        int i = 0;
        int j;
        int k = 1;
        int c = 1;

        while (i < l - 1) {
            int ele = nums[i];
            j = i + 1;

            while (j < l && ele == nums[j]) {
                j++;
            }

            if (j < l) {
                nums[c] = nums[j];
                c++;
                k++;
            }

            i = j;
        }

        return k;
}
            
        
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.print(removeDuplicates(arr));
        
    } 
}
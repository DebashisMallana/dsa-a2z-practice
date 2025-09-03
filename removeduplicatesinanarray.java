import java.util.*;
class removeduplicatesinanarray {
    public int removeDuplicates(int[] nums) {
        int i = 0, c = 0, j;
        while (i < nums.length) {
            j = i + 1;
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            nums[c] = nums[i];
            i = j;
            c++;
        }
        return c;
    }
public static void main(String[] args) {
    removeduplicatesinanarray ob =new removeduplicatesinanarray();
    int b[] = {9, 7, 0, 6, 5, 9, 78, 98, 67, 87, 56, 43,0,56,97,97,9,8,05, 23, 1, 2, 3, 6, 8, 0, 7, 5, 3, 267, 789, 0};
    Arrays.sort(b);
    int k= ob.removeDuplicates(b);
    System.err.println(k);
    for (int num = 0; num < b.length; num++) {
     System.out.print(b[num] + " ");
    }
}
}



import java.util.*;
public class mergesortedarray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int c=0;    
        while(i<m && j<n)
        {
            int ele=nums1[i];
             if(ele<nums2[j])
            {
                nums1[c++]=nums1[i];
                i++;
            }
            else if(ele>nums2[j])
            {
                nums1[c++]=nums2[j];
                j++;
            }
            else
            {
            nums1[c++]=nums1[i];
            nums1[c++]=nums2[j];
            i++;
            j++;
            }
    }
}
public static void main(String[] args) {
    mergesortedarray obj = new mergesortedarray();
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    obj.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
}
}
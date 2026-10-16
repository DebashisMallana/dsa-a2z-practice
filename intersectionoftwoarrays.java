import java.util.*;
public class intersectionoftwoarrays {
        public static int[] intersection(int[] nums1, int[] nums2) {
        boolean k[]=inter(nums1, nums2);
        int l1= nums1.length;
        int l2=nums2.length;
        int res[]=new int[Math.min(l1,l2)];
        int c=0;
        for(int i=0;i<k.length;i++)
        {
            if(k[i] && c<res.length) { res[c]=i; c++; }
        }
        return Arrays.copyOf(res, c);
        }
        public static boolean[] inter(int nums1[],int nums2[])
        {
            boolean isPresent[]=new boolean[1001];
            int l1=nums1.length;
            int l2=nums2.length;
            Arrays.fill(isPresent,false);
            for(int i=0;i<l1;i++)
            {
            for(int j=0;j<l2;j++)
            {
                if(nums1[i]==nums2[j]) isPresent[nums1[i]]=true;
           }        
          }
              return isPresent;
        }

public static void main(String[] args) {
    int nums1[]={4,9,5};
    int nums2[]={9,4,9,8,4};
    int arr[]=intersection(nums1,nums2);
    for(int x:arr)
    {
        System.out.print(x+" ");
    }
}
}

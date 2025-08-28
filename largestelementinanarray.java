public class largestelementinanarray {
    public static void main(String[] args) {
        {
             int max=Integer.MIN_VALUE;
             int b[] = {9, 7, 0, 6, 5, 9, 78, 98, 67, 87, 56, 43,0,56,97,97,9,8,5, 23, 1, 2, 3, 6, 8, 0, 7, 5, 3, 267, 789, 0,50,502,9810,614,874,203,89,763,753,1397,637,7887,889};
             for(int i=0;i<b.length;i++)
             {
                max=Math.max(b[i],max);
             }
             System.out.println(max);
        }
    }
    
}

public class searcha2dmatrix
{
    public static boolean searchMatrix(int[][] mat, int target) {
        int lowrow = 0;
        int highrow = mat.length - 1;
        int low, high, mid = 0;

        while (lowrow <= highrow) 
        {
         int midrow = lowrow + (highrow - lowrow) / 2;
          low = 0;
           high = mat[midrow].length - 1;
            if (mat[midrow][low] <= target && mat[midrow][high]>=target) {
            while (low <= high) {
            mid = low + (high - low) / 2;
            if (mat[midrow][mid] == target)
                return true;
            else if (mat[midrow][mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
           }
           } 
            else if(mat[midrow][low]<target && mat[midrow][high]<target)
             lowrow=midrow+1;
            else
                highrow=midrow-1;
         }
             return false;
     } 

    public static void main(String[] args) {
   int[][] matrix = {
    {1, 4, 7, 11, 15},
    {2, 5, 8, 12, 19},
    {3, 6, 9, 16, 22},
    {10, 13, 14, 17, 24},
    {18, 21, 23, 26, 30}
};

int target = 5;
System.out.println(searchMatrix(matrix,target));
    }
}
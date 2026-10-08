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
           return false;
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
    {1, 3, 5, 7},
    {10, 11, 16, 20},
    {23, 30, 34, 60}
};

int target = 13;
System.out.println(searchMatrix(matrix,target));
    }
}
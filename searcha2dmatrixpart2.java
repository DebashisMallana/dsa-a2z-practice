public class searcha2dmatrixpart2 {
     public static boolean searchMatrix(int[][] mat, int target) {
   if(mat.length==0) return false;
    int rows=mat.length;
    int cols=mat[0].length;
    int row=0;
    int col=cols-1;
    while(row<rows && col>=0)
    {
      if(target<mat[row][col])
    {
        col--;
    }
    else if(target>mat[row][col])
    {
        row++;

    }
    else 
        return true;
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

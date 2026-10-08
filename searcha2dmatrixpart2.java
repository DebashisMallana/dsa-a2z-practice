public class searcha2dmatrixpart2 {
     public static boolean searchMatrix(int[][] mat, int target) {
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if((i+j)==mat.length)
                {
                    if(target > mat[i][j]) i++;
                    else if(target<mat[i][j]) j++;
                    else return true;
                }

            }x`x`
        }
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

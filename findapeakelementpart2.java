public class findapeakelementpart2
{  
    public static int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int low = 0;
        int high = col - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int colmax = mat[0][mid];
            int rowindex = 0;
            for (int j = 0; j < row; j++) {
                if (mat[j][mid] > colmax) {
                    colmax = mat[j][mid];
                    rowindex = j;
                }
            }
            int leftNeighbor = -1;
            int rightNeighbor = -1;
            
            if (mid - 1 >= 0) {
                leftNeighbor = mat[rowindex][mid - 1];
            }
            
            if (mid + 1 < col) {
                rightNeighbor = mat[rowindex][mid + 1];
            }
            if (colmax > leftNeighbor && colmax > rightNeighbor) {
                return new int[]{rowindex, mid};
            } else if (leftNeighbor > colmax) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return new int[]{-1, -1}; 
    }
    public static void main(String[] args) {
        int[][] arr = {
    {7, 44, 15, 31, 2, 40, 36},//0
    {21, 40, 42, 5, 41, 30, 45},//1
    {20, 42, 27, 8, 9, 3, 20},//2
    {32, 8, 7, 16, 35, 9, 25},//3
    {30, 24, 43, 48, 45, 35, 27},//4
    {38, 48, 47, 10, 27, 42, 7},//5
    {32, 40, 27, 18, 3, 45, 24},//6
    {14, 29, 16, 24, 7, 44, 35}//7
};
int k[]=new int [2];
k=findPeakGrid(arr);
for(int i:k)
    System.out.print(i+" ");
    }
}
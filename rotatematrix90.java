public class rotatematrix90 {
    public void rotate(int a[][])
    {
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<=col/2;j++)
            {
               int t1=a[i][j];
               a[i][j]=a[i][col-j-1];
               a[i][col-j-1]=t1;
            }
        }

    }
    public static void main(String[] args) {
        rotatematrix90 ob =new rotatematrix90();
        int[][] b = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
        };
        ob.rotate(b);
        int row=b.length;
        int col=b[0].length;
          for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {                               
                System.out.print(b[i][j]+" ");             
            }
            System.out.println();
        }
    }
}
public class rowswithmaximumones
{
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int rows=mat.length;
        int columns;
        int c=0,ans=0,max=0;
        int res[]=new int [2];
        for(int i=0;i<rows;i++)
        {
            columns=mat[i].length;
            for(int j=0;j<columns;j++)
            {
                    if(mat[i][j]==1) c++;
                    if(c>max)
                    {
                        max=c;
                        ans=i;
                    }

                }
                c=0;
            }
        res[0]=ans;
        res[1]=max;
        return res;
    }
    public static void main(String[] args) {
        int arr[][]={{0,1},{1,0}};
        int k[]=rowAndMaximumOnes(arr);
        for(int i:k)
        {
            System.out.print(i+" ");
        }
        
    }
}
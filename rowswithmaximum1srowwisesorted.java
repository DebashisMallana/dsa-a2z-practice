public class rowswithmaximum1srowwisesorted
{
    public static int rowAndMaximumOnes(int[][] mat) {
        int rows=mat.length;
                int columns;
                int c1=0,ans=-1,max=0;
                int low,high,mid=0;;
                for(int i=0;i<rows;i++)
                {
                    columns=mat[i].length;
                      low=0;
                      high=columns-1;
                      while(low<=high){
                        mid=low+(high-low)/2;
                        if(mat[i][mid]==0)
                        {
                            low=mid+1;
                        }
                        else
                        {
                           high=mid-1;
                        }                                 
                       }     
                       if(high!=columns-1)
                       c1=columns-low;
                        if(c1>max)
                        {
                        max=Math.max(c1,max);
                        ans=i;
                        }  
                        c1=0;                 
                    }
                return ans;
        
    }
    public static void main(String[] args) {
       int[][] arr = {
    {0, 1, 1, 1},
    {0, 0, 1, 1},
    {1, 1, 1, 1}
};
        System.out.print(rowAndMaximumOnes(arr));
        
    }
}
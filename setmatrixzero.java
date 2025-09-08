public class setmatrixzero {
    public void set(int[][] a) 
    {
     boolean is_first_row=false;
        boolean is_first_column=false;
        int row=a.length;
        int col=a[0].length;
         for(int i=0;i<col;i++)
         {
            if(a[0][i]==0)
            {
            is_first_row=true;
            break;
            }
            
         }
         for(int j=0;j<row;j++)
         {
            if(a[j][0]==0)
            { 
              is_first_column=true;
              break;
            }
            
         }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {                               
                if(a[i][j]==0)
                {
                  a[i][0]=0;
                  a[0][j]=0;
                }                
            }
        }
         for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            { 
                if(a[i][0]==0 || a[0][j]==0)
                a[i][j]=0;                
                
            }
      
         }
        if(is_first_row==true)
        {
            for(int i=0;i<col;i++)
            a[0][i]=0;
        }
        if(is_first_column==true)
        {
            for(int j=0;j<row;j++)
            a[j][0]=0;
        }
    }

    public static void main(String[] args) {
        setmatrixzero ob=new setmatrixzero();
        int[][] b = {
    {1, 1, 1},
    {1, 1, 1},
    {1, 0, 1}
        };
          ob.set(b);
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

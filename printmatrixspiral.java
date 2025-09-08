public class printmatrixspiral {
    public void print (int a[][])
    {
        int row=a.length;
        int col=a[0].length;
        int fc=0,fr=0,lc=col-1,lr=row-1;
        while(fr<=lr && fc<=lc)
        { 
        for(int i=fc;i<=lc;i++)
        System.out.print(a[fr][i]+" ");
        fr++;
        for(int j=fr;j<=lr;j++)
        System.out.print(a[j][lc]+" ");
        lc--;
        if(fr<=lr)
        {
        for(int j=lc;j>=fc;j--)
        System.out.print(a[lr][j]+" ");
        lr--;
        }
        if(fc<=lc)
        {for(int i=lr;i>=fr;i--)
        System.out.print(a[i][fc]+" ");
        fc++;}               
        }       
    }
    public static void main(String[] args) {
        printmatrixspiral ob=new printmatrixspiral();
        int[][] b = {
    {1, 2, 3,4},
    {5, 6,7,8},
    {9,10,11,12},
    {13,14,15,16}
        };
        ob.print(b);
    }
    
}

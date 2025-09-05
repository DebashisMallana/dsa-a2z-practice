public class rearrangearrraypositivenegatives {
    public int[] rearrange(int a[])
    {
        int i=0;
        int j=1;
        int temp[]=new int[a.length];
        for(int k=0;k<a.length;k++)
        {
            if(a[k]>0 && i<a.length)
            {
                temp[i]=a[k];
                i+=2;
            }
            else
            {
                if(j<a.length)
                {
                    temp[j]=a[k];
                    j+=2;
                }
            }
        }
        return(temp);
    }
       public static void main(String[] args) {
    rearrangearrraypositivenegatives ob= new rearrangearrraypositivenegatives();
    int b[]={1,2,-4,-5};
    int c[]={3,1,-2,-5,2,-4};
    int k[]=ob.rearrange(c);
    for (int num = 0; num < k.length; num++) {
        System.out.print(k[num] + " ");
}
}
}

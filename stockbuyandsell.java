public class stockbuyandsell {
    public int profit (int a[])
    {
       int i=0,j=0,max=0;
       int diff;
       while(j<a.length)
       {    
        diff=a[j]-a[i];
        if(diff<0)  i=j;
        if(diff==0) j+=1;
        if(diff>0)
        {
            if(diff>max)
            max=diff;
            j+=1;
        }
     }
    return(max);
 }
    public static void main(String[] args) 
        {
            stockbuyandsell ob= new stockbuyandsell();
            int b[]={7,1,5,3,6,4};
            int c[]={7,6,4,3,1};
            int k=ob.profit(c);
            System.out.println(k);
        }
    }
    

    


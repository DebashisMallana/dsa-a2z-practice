public class maxnumberofconsecutive1s {
    public int find(int a[])
    {
        int curr=0,max=0;
       for(int i=0;i<a.length;i++)
       {
        if(a[i]==1)
        { 
        curr+=1;
        max=Math.max(max, curr);
        }
        else
        curr=0;
         }
        return(max);
    }
     public static void main(String[] args) {
        maxnumberofconsecutive1s ob= new maxnumberofconsecutive1s();
        int b[]={1,1,0,0,1,1,1,0};
       int k= ob.find(b);
       System.out.println(k);
    
}
}

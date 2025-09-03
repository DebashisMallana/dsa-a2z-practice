public class findmissingnumber {
    public int misnumber(int a[])
    {
        int l=a.length;
        int xor1=1,xor2=1;
        for(int i=0;i<l;i++)
        {
           xor1=xor1^a[i];
           xor2=xor2^(i+1); 
        }
        int num=xor1^xor2;
        return (num);
    }
    public static void main(String[] args) {
        findmissingnumber ob=new findmissingnumber();
        int b[]={0,1,3};
       int k= ob.misnumber(b);
       System.err.println(k);
    }
    
}

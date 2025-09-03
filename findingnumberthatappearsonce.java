public class findingnumberthatappearsonce {
    public int onenumber(int a[])
    {
        int xor=0;
      for(int i=0;i<a.length;i++)
      xor=xor^a[i];
      return(xor);
    }
    public static void main(String[] args) {
        findingnumberthatappearsonce ob =new findingnumberthatappearsonce();
        int b[]={2,2,1};
        int k=ob.onenumber(b);
        System.out.println(k);
    }
    
}

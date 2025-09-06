public class displayleaderelements
{
    public void display(int a[])
    {
        int max=0;
        int n=a.length;
       for(int i=n-1;i>=0;i--)
       {
          if(a[i]>max){
          System.out.print(a[i]+" ");
          max=a[i];
         }
     }
    }
    public static void main(String[] args) {
        {
            displayleaderelements ob =new displayleaderelements();
            int b[]={10, 22, 12, 3, 0, 6};
            ob.display(b);
        }
    }
}
public class contest1
{           
  public static boolean threeFibonacciSum(int n) {
       int a=0,b=1,c=0;
            for(int i=1;i<=n;i++)
            {
               c=a+b;
               int s=a+b+c;
               if(s==n) return true;
               if(s>n) return false;
               a=b;
               b=c;
               s=0;
            }
    return false;
}   
 public static void main(String[] args) {
    int n=126491970;
    System.out.print(threeFibonacciSum(n));
}
}
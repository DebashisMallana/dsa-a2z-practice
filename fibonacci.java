class fibonacci {
    public int fib(int n) {
        int a[]=new int[50];
         a[0]=0;
         a[1]=1;
        for(int i=2;i<a.length;i++)
        {
            a[i]=a[i-2]+a[i-1];
            a[i-2]=a[i-1];
            a[i-1]=a[i];
        }
        return(a[n-1]+a[n-2]);
    }
    public static void main(String[] args) {
        fibonacci ob=new fibonacci();
        System.out.println(ob.fib(5));
    }
        
    }
import java.util.ArrayList;
import java.util.List;
public class contest1javamed {      
    public static int[] ischeck(int n)
    {
        int primes[]=new int [n];
        int count=0;
        for (int i = 2; i <= n; i++) {
    boolean isPrime = true;

    for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        primes[count++] = i;
    }
}
return primes;
    }
  public static List<Integer> maxPrimes(int n, int sum) {
       int a[]=new int [sum];
       a=ischeck(sum);
       ArrayList<Integer> list = new ArrayList<>();
         int i=0,j=0,s=0,max=0;
        while(j<a.length)
        {            
            while(s<sum)
            {
               s=s+a[j];
               if(s!=sum)
               j+=1;
            }
            if(j-i+1>max && s<=sum)
            {
                int x=i;
                int y=j;
                while(x<=y)
                {
                    list.add(a[x]);
                    x++;
                }
            }
            else
            i++;
        }
       return list;      
    }
 public static void main(String[] args) {
    int n = 15, s = 15;
    System.out.print(maxPrimes(n,s));
}
}
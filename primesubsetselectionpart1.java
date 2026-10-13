import java.util.*;
public class primesubsetselectionpart1
{
   public static boolean[] checkPrime(int n)
   {
      //creating two arrays
      boolean isPrime[]=new boolean [n+1];// to store the boolean values of all the numbers until n
      Arrays.fill(isPrime,true);
      isPrime[0]=false;
      isPrime[1]=false;
      for(int i=2;i*i<=n;i++)// loop from the current number to its square
      {
         if(isPrime[i])
         {
         for(int p=i*i;p<=n;p+=i)
         {
            isPrime[p]=false;
         }
      }
   }
    return isPrime;
   }
     public static List<Integer> maxPrimes(int n, int s) {
long sum=0;
ArrayList<Integer> list = new ArrayList<>();
       boolean k[]=checkPrime(n);
       for(int i=2;i<=n;i++)
       {
         if(k[i])
         {
          if(i+sum<=s)
          {
            sum+=i;
            list.add(i);
          }
          else
          {
            break;
          }
       }
      }
       return list;
      }
    public static void main(String[] args) {
        int  n = 15, s = 15;
        System.out.println(maxPrimes(n,s));
    }
}

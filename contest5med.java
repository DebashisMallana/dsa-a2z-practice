public class contest5med
{
    public static long  gcd(long a, long b)
    {
          while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
      public static long minimumMaxValue(int n, int index, int value) {
        long arr[]=new long [n];
        arr[index]=value;
        long c=value+1;
        for(int i=index;i<n-1;i++)
        {
           for (int j = index; j < n - 1; j++) 
            while (gcd(arr[j], c) == 1) {
              c++; 
              }
         arr[i + 1] = c; 
          c++;
        }
        if(arr[n-1]>0)  return arr[n-1];
        return -1;
      
    }

    public static void main(String[] args) {
        System.out.print(minimumMaxValue(2, 1, 3)+" ");
    }
}

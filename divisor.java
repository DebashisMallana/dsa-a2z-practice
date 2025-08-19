import java.util.Scanner;
public class divisor {
    public void divisors(int n)
    {
        for(int i=1;i<=Math.sqrt(n);i++)
        {
                if(n%i==0)
              System.out.println(i);
                if(i!=(n/i))
                System.out.println(n/i);
        }               
    }
            //for(int j=0;j<div.length;j++)
            //if(div[j]!=0)
            //System.out.println("the divisor of n is"+div[j]);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        divisor ob=new divisor();
        System.out.println("Enter a number");
        int num=sc.nextInt();          
        ob.divisors(num);
        sc.close();
    }
}
    


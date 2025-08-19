import java.util.Scanner;
public class armstrongoptimal {
     public boolean isarmstrong (int n)
    {
        int num=n,x=n,div;
        double s=0.0,c=0.0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        int pow[]=new int[10];
        for(int i=0;i<=9;i++)
        {
            int p=1;
            for(int j=1;j<=c;j++)
            {
            p=p*i;
            }
            pow[i]=p;
            
        }
        while(x!=0)
        {
            div=x%10;
            s=s+pow[div];
            x=x/10;
        }
        return (num==s);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        armstrong ob=new armstrong();
        System.out.println(ob.isarmstrong(num));
        sc.close();
    }
}
    


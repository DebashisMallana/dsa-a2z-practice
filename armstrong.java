
import java.util.Scanner;
public class armstrong
 {
    public boolean isarmstrong (int n)
    {
        int num=n,x=n,div;
        double s=0.0,c=0.0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        while(x!=0)
        {
            div=x%10;
            s=s+Math.pow(div,c);
            x=x/10;
        }
        if(num==s)
        return(true);
        else
        return(false);
        
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

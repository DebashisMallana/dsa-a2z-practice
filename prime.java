import java.util.Scanner;
public class prime {  
    public boolean checkprime(int n)
    {
        if(n<=1) return(false);
        if(n==2 || n==3) return(true);
        for(int i=2;i*i<=n;i++)
        {
                if(n%i==0) return(false);
        } 
        return(true);              
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        prime ob=new prime();
        System.out.println("Enter a number");
        int num=sc.nextInt();          
        System.out.println(ob.checkprime(num));
        sc.close();
    }
}


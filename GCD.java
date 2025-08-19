import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int GCD=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers N1 and N2");
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        if(N1%N2==0)
        GCD=N2;
        if(N2%N1==0)
        GCD=N1;
        for(int i=2;i<N1 && i<N2;i++)
        {
            if(N1%i==0 && N2%i==0)
            GCD=i;
        }        
        System.out.println(GCD);
        sc.close();
    }
}
